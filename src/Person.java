public class Person {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String _name, String _position, String _email, String _phone, int _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    public void info() {
        System.out.println(" Имя: " + name + " Должность: " + position + " email: " + email + " Телефон: " + phone +
                " Зарплата: " + salary + " Возраст: " + age);
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "Менеджер", "iva007@mail.ru",
                "89275521687", 35000, 25);
        persArray[1] = new Person("Петряшкин Илья Алексеевич", "Водитель", "12345@yandex.ru",
                "89874561879", 40000, 29);
        persArray[2] = new Person("Мельников Андрей Владимирович", "Прораб",
                "melnikovav@yandex.ru","89643218796", 850000, 36);
        persArray[3] = new Person("Фатеев Антон Игоревич", "Директор", "toha777@gmail.com",
                "89247418525", 200000, 56);
        persArray[4] = new Person("Аверьянов Артур Артёмович", "Инженер-технолог",
                "averyaa@yandex.ru","893217474", 900000, 31);
//        Цикл для вывода массива в консоль
//        System.out.println("Сведения о сотрудниках");
//        for (int r = 0; r < persArray.length; r++) {
//            persArray[r].info();
//        }

    }
}