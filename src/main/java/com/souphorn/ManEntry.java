package com.souphorn;

import java.util.HashMap;
import java.util.Map;

public class ManEntry {
    public static void main(String[] args) {
        var data = Map.of(
                "dd", "kkkk",
                "key1", "value 1"
        );

        System.out.println(data.get("key1"));


    }
}
