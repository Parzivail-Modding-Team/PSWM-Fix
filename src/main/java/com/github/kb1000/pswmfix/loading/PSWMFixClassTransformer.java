package com.github.kb1000.pswmfix.loading;

import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.*;

import java.util.HashMap;

import static com.github.kb1000.pswmfix.util.MapUtils.entry;
import static com.github.kb1000.pswmfix.util.MapUtils.mapOf;
import static org.objectweb.asm.Opcodes.*;

public class PSWMFixClassTransformer implements IClassTransformer {
    private static final HashMap<String, String> classMap = mapOf(entry("com/parzivail/pswm/blocks/BlockCrystalOre", "com/github/kb1000/pswmfix/blocks/BlockCrystalOre"), entry("com/parzivail/pswm/blocks/ore/BlockFocusingCrystalOre", "com/github/kb1000/pswmfix/blocks/BlockFocusingCrystalOre"));
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        switch (transformedName) {
            case "com.parzivail.pswm.registry.BlockRegister":
                final ClassReader classReader = new ClassReader(basicClass);
                final ClassWriter classWriter = new ClassWriter(classReader, 0);
                classReader.accept(new ClassVisitor(ASM5, classWriter) {
                    @Override
                    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
                        if (name.equals("registerAll")) {
                            return new MethodVisitor(ASM5, super.visitMethod(access, name, desc, signature, exceptions)) {
                                @Override
                                public void visitTypeInsn(int opcode, String type) {
                                    type = classMap.getOrDefault(type, type);
                                    super.visitTypeInsn(opcode, type);
                                }

                                @Override
                                public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
                                    owner = classMap.getOrDefault(owner, owner);
                                    super.visitMethodInsn(opcode, owner, name, desc, itf);
                                }
                            };
                        }
                        return super.visitMethod(access, name, desc, signature, exceptions);
                    }
                }, 0);
                return classWriter.toByteArray();
            default:
                return basicClass;
        }
    }
}
