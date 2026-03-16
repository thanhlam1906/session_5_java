public class Bai2 {
    public static void main(String[] args) {
        int loopCount = 1_000_000;

        // Test với String
        long start = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < loopCount; i++) {
            str += " World";
        }
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start) + " ms");

        // Test với StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < loopCount; i++) {
            sb.append(" World");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + " ms");

        // Test với StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < loopCount; i++) {
            sbf.append(" World");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start) + " ms");

//        String: rất chậm vì mỗi lần nối chuỗi sẽ tạo ra một đối tượng mới (immutable). Với 1 triệu vòng lặp, thời gian thực thi sẽ cực kỳ lâu.
//        StringBuilder: nhanh nhất, vì nó không đồng bộ (không thread-safe) nhưng hiệu quả trong môi trường đơn luồng.
//        StringBuffer: chậm hơn StringBuilder một chút, vì có cơ chế đồng bộ để đảm bảo an toàn trong môi trường đa luồng.
    }
}
