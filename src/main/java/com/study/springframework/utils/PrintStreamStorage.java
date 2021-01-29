package com.study.springframework.utils;

import java.util.HashMap;
import java.util.Map;

public class PrintStreamStorage {
    private Map<String, Integer> printStreamStorage = new HashMap<>();
    private Integer index = 0;

    private static class HOLDER
    {
        @SuppressWarnings("synthetic-access")
        static final PrintStreamStorage INSTANCE = new PrintStreamStorage();
    }

    /**
     * Get the instance
     *
     * @return the instance
     */
    public static PrintStreamStorage getInstance()
    {
        return HOLDER.INSTANCE;
    }


    public void println(String input) {
        printStreamStorage.put(input, index++);
    }

    public Map<String, Integer> getPrintStreamStorage() {
        return printStreamStorage;
    }
}
