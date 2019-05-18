package com.aayushatharva.hextodecimal;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aayush Atharva
 */
public class HexToDecimal {

    public BigInteger getDecimalFromHex(String Hex) {
        List<BigInteger> HexBlockDecimals = new ArrayList<>();

        String[] HexBlock = Hex.split(""); // Break Hex Into Single Blocks

        int Power = HexBlock.length - 1;

        for (String Block : HexBlock) {
            // Get Decimal Base
            String DecimalBase = DecimalBase(Block);

            // Compute Power Of Hex Block
            BigInteger power = new BigInteger("16");
            power = power.pow(Power);

            // Compute Whole Hex Block
            BigInteger BlockCompute = new BigInteger(DecimalBase);
            BlockCompute = BlockCompute.multiply(power);

            // Add Block Decimal To List
            HexBlockDecimals.add(BlockCompute);

            // Reduce Power By 1
            Power--;
        }

        // Compute Decimal Base Of All Blocks
        BigInteger ComputeDecimal = new BigInteger("0");
        for (BigInteger BlockInteger : HexBlockDecimals) {
            ComputeDecimal = ComputeDecimal.add(BlockInteger);
        }

        return ComputeDecimal;
    }

    private String DecimalBase(String Hex) {
        Hex = Hex.toUpperCase();

        switch (Hex) {
            case "0":
                return HEX_0;
            case "1":
                return HEX_1;
            case "2":
                return HEX_2;
            case "3":
                return HEX_3;
            case "4":
                return HEX_4;
            case "5":
                return HEX_5;
            case "6":
                return HEX_6;
            case "7":
                return HEX_7;
            case "8":
                return HEX_8;
            case "9":
                return HEX_9;
            case "A":
                return HEX_A;
            case "B":
                return HEX_B;
            case "C":
                return HEX_C;
            case "D":
                return HEX_D;
            case "E":
                return HEX_E;
            case "F":
                return HEX_F;
            default:
                break;
        }

        return null;
    }

    private static final String HEX_0 = "0";
    private static final String HEX_1 = "1";
    private static final String HEX_2 = "2";
    private static final String HEX_3 = "3";
    private static final String HEX_4 = "4";
    private static final String HEX_5 = "5";
    private static final String HEX_6 = "6";
    private static final String HEX_7 = "7";
    private static final String HEX_8 = "8";
    private static final String HEX_9 = "9";
    private static final String HEX_A = "10";
    private static final String HEX_B = "11";
    private static final String HEX_C = "12";
    private static final String HEX_D = "13";
    private static final String HEX_E = "14";
    private static final String HEX_F = "15";

}
