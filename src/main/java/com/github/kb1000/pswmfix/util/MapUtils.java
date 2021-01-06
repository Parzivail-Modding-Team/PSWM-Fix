package com.github.kb1000.pswmfix.util;

import java.util.HashMap;
import java.util.Map;

public final class MapUtils {
    private MapUtils() {
        throw new UnsupportedOperationException("no instances for you!");
    }

    public static final class MapEntry<K, V> implements Map.Entry<K, V> {
        private final K key;
        private final V value;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            throw new UnsupportedOperationException();
        }
    }

    public static <K, V> MapEntry<K, V> entry(K key, V value) {
        return new MapEntry<>(key, value);
    }

    @SafeVarargs
    public static <K, V> HashMap<K, V> mapOf(Map.Entry<K, V>... entries) {
        final HashMap<K, V> map = new HashMap<>();
        for (Map.Entry<K, V> entry: entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
