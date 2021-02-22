import java.util.Arrays;

class Revers {
    public static void main(String[] args) {
        byte[] arrayByte = {8, 48, 45, 4, 54, -58};
        System.out.println("Изнчальный массив: " + Arrays.toString(arrayByte));
        revers(arrayByte);
    }

    public static void revers(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            value = ((value & 0x55) << 1) | ((value >> 1) & 0x55);
            value = ((value & 0x33) << 2) | ((value >> 2) & 0x33);
            value = ((value & 0x0F) << 4) | ((value >> 4) & 0x0F);
            System.out.println(array[i] + " byte revers to " + (byte) value);
            array[i] = (byte) value;
        }
        System.out.println("Результат: " + Arrays.toString(array));
    }
}
