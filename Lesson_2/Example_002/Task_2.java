package Lesson_2.Example_002;

public class Task_2 {
    public static void main(String[] args) {
        String json = """
                [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
                {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
                {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
                """;

        json = json.replace("[{", "")
                .replace("}]", "")
                .replace("\n", "")
                .replace(" ", "");
        String[] entries = json.split("},\\{");

        for (String entry : entries) {
            String[] fields = entry.split(",");
            String lastName = "";
            String mark = "";
            String subject = "";

            for (String field : fields) {
                String key = field.substring(1, field.indexOf(":") - 1);
                String value = field.substring(field.indexOf(":") + 2, field.length() - 1);

                switch (key) {
                    case "фамилия":
                        lastName = value;
                        break;
                    case "оценка":
                        mark = value;
                        break;
                    case "предмет":
                        subject = value;
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Студент ").append(lastName)
                    .append(" получил ").append(mark)
                    .append(" по предмету ").append(subject)
                    .append(".");
            System.out.println(sb.toString());
        }
    }
}
