package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> result = new HashMap<>();
        Set<String> valuesOfStrSet = new HashSet<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()){
            result.put(entry.getKey().length(), null);
            valuesOfStrSet.add(entry.getKey());
        }

        for (Map.Entry<Integer, Set<String>> entry : result.entrySet()){
            Set<String> setForMap = new HashSet<>();
            for (String val: valuesOfStrSet)
                if (val.length()==entry.getKey())
                    setForMap.add(val);
            result.put(entry.getKey(), setForMap);
        }
        return result;
    }
}
