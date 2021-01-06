package com.github.kb1000.pswmfix;

import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class Hooks {
    public static void kickPlayerFromMessageContext(MessageContext messageContext) {
        messageContext.getServerHandler().kickPlayerFromServer("Hacked client (PSWM packet abuse)");
    }
}
