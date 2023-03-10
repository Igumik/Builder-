public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(37)
                .setAddress("Сидней")
                .build();

        if (mom.hasAge()) {
            mom.happyBirthday();
        }
        if (!mom.hasAddress()) {
            mom.setAddress("Лондон");
        }
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
    }
}