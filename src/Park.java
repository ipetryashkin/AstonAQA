public class Park {
    public static void main(String[] args) {
        Attraction attraction1 = new Attraction("Американские горки", "10:00-20:00", 2500);
        Attraction attraction2 = new Attraction("Орбита", "10:00-20:00", 1500);
        Attraction attraction3 = new Attraction("Емеля", "10:00-20:00", 2000);
        Attraction attraction4 = new Attraction("Лодочки", "10:00-20:00", 800);
        attraction1.info();
        attraction2.info();
        attraction3.info();
        attraction4.info();
    }

    public static class Attraction {
        String attraction;
        String working_hours;
        int price;

        public Attraction(String _attraction, String _working_hours, int _price) {
            attraction = _attraction;
            working_hours = _working_hours;
            price = _price;
        }

        public void info() {
            System.out.println(" Название аттракциона: " + attraction + " Время работы: " + working_hours +
                    " Стоимость, руб: " + price);
        }
    }
}