# HexDecimal
Convert Hex To Decimal In Java

```Java
public class Main {

    public static void main(String[] args) {
        String Hex = "29374DB6F3488091C93C4816C11F4ACC";

        HexToDecimal hexToDecimal = new HexToDecimal();
        BigInteger decimal = hexToDecimal.getDecimalFromHex(Hex);

        DecimalToHex decimalToHex = new DecimalToHex();
        String DecimalToHex = decimalToHex.DecimalToHex(decimal);

        System.out.println("Hex To Decimal: " + decimal);
        System.out.println("Decimal To Hex: " + DecimalToHex);

        /**
         * Outputs:
         *
         * Hex To Decimal: 54785500394758532281144699898914884300 
         * Decimal To Hex: 29374DB6F3488091C93C4816C11F4ACC
         */
    }
    
}
```
