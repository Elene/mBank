package com.example.elenek.mbank.utils;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OperationUtils {

    private static final HashMap<Integer, List<Integer>> operationSigns = generateOperationSigns();

    private static HashMap<Integer, List<Integer>> generateOperationSigns() {
        List<Integer> operationsPositive = new ArrayList<>();

        operationsPositive.add(5);

        List<Integer> operationsNegative = new ArrayList<>();

        operationsNegative.add(6);
        operationsNegative.add(7);
        operationsNegative.add(9);

        HashMap<Integer, List<Integer>> operationSigns = new HashMap<>();
        operationSigns.put(-1, operationsNegative);
        operationSigns.put(1, operationsPositive);
        return operationSigns;
    }

    public static Integer getOperationSign(Integer operationId) {
        if (operationSigns.get(-1).contains(operationId))
            return -1;
        return 1;
    }
}
