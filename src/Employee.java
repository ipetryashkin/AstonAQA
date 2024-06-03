public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String _name, String _position, String _email, String _phone, int _salary, int _age) {
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
        Employee employee1 = new Employee("Иванов Иван Иванович", "Менеджер", "iva007@mail.ru",
                "89275521687", 35000, 25);
        employee1.info();
    }
}