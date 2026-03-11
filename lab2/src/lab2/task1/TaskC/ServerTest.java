import lab2.task1.TaskC.Server;

import java.util.HashSet;
import java.util.Set;

public class ServerTest {
    public static void main(String[] args) {
        // Создаем коллекцию
        Set<Server> dataCenter = new HashSet<>();

        // 1. Создаем два идентичных сервера (Дубликаты)
        Server s1 = new Server("SN-999", "Dell", "192.168.1.1");
        Server s2 = new Server("SN-999", "Dell", "192.168.1.1");

        // 2. Создаем сервер с тем же серийником, но другим IP
        Server s3 = new Server("SN-999", "Dell", "10.0.0.5");

        // 3. Создаем абсолютно другой сервер
        Server s4 = new Server("SN-100", "HP", "172.16.0.1");

        // Добавляем всё в HashSet
        dataCenter.add(s1);
        dataCenter.add(s2); // Этот не должен добавиться (дубликат s1)
        dataCenter.add(s3); // Этот добавится, так как IP отличается
        dataCenter.add(s4); // Этот добавится (все поля разные)

        // Проверяем результат
        System.out.println("Servers in set:");
        for (Server s : dataCenter) {
            System.out.println(s);
        }

        System.out.println("--------------------");
        System.out.println("Expected size: 3");
        System.out.println("Actual size: " + dataCenter.size());

        if (dataCenter.size() == 3) {
            System.out.println("SUCCESS: Equals and HashCode are working correctly!");
        } else {
            System.out.println("FAILED: Check your equals or hashCode logic.");
        }
    }
}