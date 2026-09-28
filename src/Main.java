//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество элементов массива: ");
//        int n = scanner.nextInt();
//
//        int[] array = new int[n];
//
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += array[i];
//        }
//
//        double average = (double) sum / n;
//
//        System.out.println("Сумма элементов: " + sum);
//        System.out.println("Среднее арифметическое: " + average);
//
//        scanner.close();
//    }
//}
//
//
//
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество элементов массива: ");
//        int n = scanner.nextInt();
//
//        int[] array = new int[n];
//
//        System.out.println("Введите элементы массива:");
//        int i = 0;
//        while (i < n) {
//            array[i] = scanner.nextInt();
//            i++;
//        }
//
//        int sum = 0;
//        int j = 0;
//        do {
//            sum += array[j];
//            j++;
//        } while (j < n);
//
//        int max = array[0];
//        int min = array[0];
//        int k = 1;
//        while (k < n) {
//            if (array[k] > max) {
//                max = array[k];
//            }
//            if (array[k] < min) {
//                min = array[k];
//            }
//            k++;
//        }
//
//        System.out.println("Сумма элементов: " + sum);
//        System.out.println("Максимальный элемент: " + max);
//        System.out.println("Минимальный элемент: " + min);
//
//        scanner.close();
//    }
//}
//
//
//
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Количество аргументов: " + args.length);
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//    }
//}
//
//
//
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Первые 10 чисел гармонического ряда:");
//
//        // Форматированный вывод: %-5d - номер, %.4f - число с 4 знаками после запятой
//        for (int i = 1; i <= 10; i++) {
//            double value = 1.0 / i;
//            System.out.printf("Член %-2d: %.4f%n", i, value);
//        }
//    }
//}


//public class Main {
//
//    public static long factorial(int n) {
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int number = 5;
//        long result = factorial(number);
//        System.out.println(number + "! = " + result);
//    }
//}
//


//pr2


//class Author {
//
//    private String name;
//    private String email;
//    private char gender;
//
//
//    public Author(String name, String email, char gender) {
//        this.name = name;
//        this.email = email;
//        this.gender = gender;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public char getGender() {
//        return gender;
//    }
//
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
//    }
//}
//

//public class Main {
//    public static void main(String[] args) {
//
//        Author author1 = new Author("Иван Иванов", "ivan@mail.ru", 'm');
//
//
//        System.out.println("Имя автора: " + author1.getName());
//        System.out.println("Email автора: " + author1.getEmail());
//        System.out.println("Пол автора: " + author1.getGender());
//
//
//        author1.setEmail("new_email@example.com");
//        System.out.println("Новый email автора: " + author1.getEmail());
//
//
//        System.out.println("Полная информация: " + author1.toString());
//    }
//}


//class Ball {
//    private double x = 0.0;
//    private double y = 0.0;
//
//    public Ball(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public Ball() {
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }
//
//    public void setXY(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public void move(double xDisp, double yDisp) {
//        this.x += xDisp;
//        this.y += yDisp;
//    }
//
//    @Override
//    public String toString() {
//        return "Ball (" + x + ", " + y + ")";
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Ball ball1 = new Ball();
//        System.out.println("Начальное состояние ball1: " + ball1.toString());
//
//        ball1.setX(1.5);
//        ball1.setY(2.5);
//        System.out.println("После setX и setY: " + ball1.toString());
//
//        ball1.setXY(3.0, 4.0);
//        System.out.println("После setXY: " + ball1.toString());
//
//        ball1.move(2.5, -1.0);
//        System.out.println("После move(2.5, -1.0): " + ball1.toString());
//
//        Ball ball2 = new Ball(10.0, 20.0);
//        System.out.println("Состояние ball2 (создан с параметрами): " + ball2.toString());
//
//        System.out.println("Координата X для ball2: " + ball2.getX());
//        System.out.println("Координата Y для ball2: " + ball2.getY());
//    }
//}

//class Point {
//    private double x;
//    private double y;
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public Point() {
//        this.x = 0.0;
//        this.y = 0.0;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }
//
//    public void setXY(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    @Override
//    public String toString() {
//        return "Point (" + x + ", " + y + ")";
//    }
//}
//
//class Circle {
//    private Point center;
//    private double radius;
//
//    public Circle(Point center, double radius) {
//        this.center = center;
//        this.radius = radius;
//    }
//
//    public Circle() {
//        this.center = new Point();
//        this.radius = 1.0;
//    }
//
//    public Point getCenter() {
//        return center;
//    }
//
//    public void setCenter(Point center) {
//        this.center = center;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public double getCircumference() {
//        return 2 * Math.PI * radius;
//    }
//
//    @Override
//    public String toString() {
//        return "Circle [center=" + center + ", radius=" + radius + "]";
//    }
//}
//
//class Tester {
//    private Circle[] circles;
//    private int count;
//
//    public Tester(int size) {
//        this.circles = new Circle[size];
//        this.count = 0;
//    }
//
//    public void addCircle(Circle circle) {
//        if (count < circles.length) {
//            circles[count] = circle;
//            count++;
//        }
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public Circle[] getCircles() {
//        return circles;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Tester tester = new Tester(5);
//
//        tester.addCircle(new Circle(new Point(1.0, 2.0), 3.0));
//        tester.addCircle(new Circle(new Point(-1.0, 4.5), 2.0));
//        tester.addCircle(new Circle());
//
//        System.out.println("Количество элементов в массиве: " + tester.getCount());
//
//        Circle[] arr = tester.getCircles();
//        for (int i = 0; i < tester.getCount(); i++) {
//            System.out.println(arr[i].toString());
//        }
//    }
//}


//import java.util.Scanner;
//
//interface Computer {
//    String getName();
//    int getRam();
//    int getHdd();
//    String getCpu();
//}
//
//class PC implements Computer {
//    private String name;
//    private int ram;
//    private int hdd;
//    private String cpu;
//
//    public PC(String name, int ram, int hdd, String cpu) {
//        this.name = name;
//        this.ram = ram;
//        this.hdd = hdd;
//        this.cpu = cpu;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public int getRam() {
//        return ram;
//    }
//
//    @Override
//    public int getHdd() {
//        return hdd;
//    }
//
//    @Override
//    public String getCpu() {
//        return cpu;
//    }
//
//    @Override
//    public String toString() {
//        return "PC [name=" + name + ", ram=" + ram + "GB, hdd=" + hdd + "GB, cpu=" + cpu + "]";
//    }
//}
//
//class Shop {
//    private Computer[] computers;
//    private int count;
//
//    public Shop(int size) {
//        this.computers = new Computer[size];
//        this.count = 0;
//    }
//
//    public void addComputer(Computer computer) {
//        if (count < computers.length) {
//            computers[count] = computer;
//            count++;
//            System.out.println("Компьютер добавлен.");
//        } else {
//            System.out.println("Магазин заполнен.");
//        }
//    }
//
//    public void removeComputer(String name) {
//        for (int i = 0; i < count; i++) {
//            if (computers[i].getName().equalsIgnoreCase(name)) {
//                for (int j = i; j < count - 1; j++) {
//                    computers[j] = computers[j + 1];
//                }
//                computers[count - 1] = null;
//                count--;
//                System.out.println("Компьютер удален.");
//                return;
//            }
//        }
//        System.out.println("Компьютер не найден.");
//    }
//
//    public void findComputer(String name) {
//        for (int i = 0; i < count; i++) {
//            if (computers[i].getName().equalsIgnoreCase(name)) {
//                System.out.println("Найден: " + computers[i].toString());
//                return;
//            }
//        }
//        System.out.println("Компьютер не найден.");
//    }
//
//    public void showAll() {
//        if (count == 0) {
//            System.out.println("Магазин пуст.");
//            return;
//        }
//        for (int i = 0; i < count; i++) {
//            System.out.println(computers[i].toString());
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Shop shop = new Shop(10);
//
//        while (true) {
//            System.out.println("\n1. Добавить компьютер");
//            System.out.println("2. Удалить компьютер");
//            System.out.println("3. Найти компьютер");
//            System.out.println("4. Показать все компьютеры");
//            System.out.println("0. Выход");
//            System.out.print("Выберите действие: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            if (choice == 1) {
//                System.out.print("Введите название: ");
//                String name = scanner.nextLine();
//                System.out.print("Введите объем RAM (GB): ");
//                int ram = scanner.nextInt();
//                System.out.print("Введите объем HDD (GB): ");
//                int hdd = scanner.nextInt();
//                scanner.nextLine();
//                System.out.print("Введите процессор: ");
//                String cpu = scanner.nextLine();
//                shop.addComputer(new PC(name, ram, hdd, cpu));
//            } else if (choice == 2) {
//                System.out.print("Введите название для удаления: ");
//                String name = scanner.nextLine();
//                shop.removeComputer(name);
//            } else if (choice == 3) {
//                System.out.print("Введите название для поиска: ");
//                String name = scanner.nextLine();
//                shop.findComputer(name);
//            } else if (choice == 4) {
//                shop.showAll();
//            } else if (choice == 0) {
//                System.out.println("Выход из программы.");
//                break;
//            } else {
//                System.out.println("Неверный ввод.");
//            }
//        }
//
//        scanner.close();
//    }
//}


//class Dog {
//    private String name;
//    private int age;
//
//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getHumanAge() {
//        return age * 7;
//    }
//
//    @Override
//    public String toString() {
//        return "Dog [name=" + name + ", age=" + age + "]";
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Dog[] dogs = new Dog[5];
//        int count = 0;
//
//        dogs[count++] = new Dog("Рекс", 3);
//        dogs[count++] = new Dog("Бобик", 5);
//        dogs[count++] = new Dog("Шарик", 2);
//
//        System.out.println("Список собак в питомнике:");
//        for (int i = 0; i < count; i++) {
//            System.out.println(dogs[i].toString() + " -> человеческий возраст: " + dogs[i].getHumanAge());
//        }
//
//        dogs[0].setName("Мухтар");
//        dogs[0].setAge(4);
//        System.out.println("\nПосле изменения данных первой собаки:");
//        System.out.println(dogs[0].toString() + " -> человеческий возраст: " + dogs[0].getHumanAge());
//    }
//}


//class Circle {
//    private double radius;
//    private String color;
//
//    public Circle() {
//        this.radius = 1.0;
//        this.color = "red";
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//        this.color = "red";
//    }
//
//    public Circle(double radius, String color) {
//        this.radius = radius;
//        this.color = color;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public double getCircumference() {
//        return 2 * Math.PI * radius;
//    }
//
//    @Override
//    public String toString() {
//        return "Circle [radius=" + radius + ", color=" + color + "]";
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        Circle c2 = new Circle(5.0);
//        Circle c3 = new Circle(3.0, "blue");
//
//        System.out.println(c1.toString());
//        System.out.println("Площадь: " + c1.getArea());
//        System.out.println("Длина окружности: " + c1.getCircumference());
//
//        System.out.println(c2.toString());
//        System.out.println("Площадь: " + c2.getArea());
//        System.out.println("Длина окружности: " + c2.getCircumference());
//
//        System.out.println(c3.toString());
//        System.out.println("Площадь: " + c3.getArea());
//        System.out.println("Длина окружности: " + c3.getCircumference());
//
//        c3.setRadius(7.5);
//        c3.setColor("green");
//        System.out.println("После изменения: " + c3.toString());
//
//        if (c2.getArea() > c3.getArea()) {
//            System.out.println("Окружность c2 больше c3");
//        } else if (c2.getArea() < c3.getArea()) {
//            System.out.println("Окружность c3 больше c2");
//        } else {
//            System.out.println("Окружности равны по площади");
//        }
//    }
//}


//class Book {
//    private String author;
//    private String title;
//    private int year;
//
//    public Book(String author, String title, int year) {
//        this.author = author;
//        this.title = title;
//        this.year = year;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    @Override
//    public String toString() {
//        return "Book [author=" + author + ", title=" + title + ", year=" + year + "]";
//    }
//}
//
//class Bookshelf {
//    private Book[] books;
//    private int count;
//
//    public Bookshelf(int size) {
//        this.books = new Book[size];
//        this.count = 0;
//    }
//
//    public void addBook(Book book) {
//        if (count < books.length) {
//            books[count] = book;
//            count++;
//        }
//    }
//
//    public Book getLatestBook() {
//        if (count == 0) return null;
//        Book latest = books[0];
//        for (int i = 1; i < count; i++) {
//            if (books[i].getYear() > latest.getYear()) {
//                latest = books[i];
//            }
//        }
//        return latest;
//    }
//
//    public Book getEarliestBook() {
//        if (count == 0) return null;
//        Book earliest = books[0];
//        for (int i = 1; i < count; i++) {
//            if (books[i].getYear() < earliest.getYear()) {
//                earliest = books[i];
//            }
//        }
//        return earliest;
//    }
//
//    public void sortByYear() {
//        for (int i = 0; i < count - 1; i++) {
//            for (int j = 0; j < count - i - 1; j++) {
//                if (books[j].getYear() > books[j + 1].getYear()) {
//                    Book temp = books[j];
//                    books[j] = books[j + 1];
//                    books[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public void showAll() {
//        for (int i = 0; i < count; i++) {
//            System.out.println(books[i].toString());
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Bookshelf shelf = new Bookshelf(5);
//
//        shelf.addBook(new Book("Толстой", "Война и мир", 1869));
//        shelf.addBook(new Book("Достоевский", "Преступление и наказание", 1866));
//        shelf.addBook(new Book("Булгаков", "Мастер и Маргарита", 1967));
//        shelf.addBook(new Book("Пушкин", "Евгений Онегин", 1833));
//
//        System.out.println("Все книги на полке:");
//        shelf.showAll();
//
//        System.out.println("\nСамая поздняя книга: " + shelf.getLatestBook());
//        System.out.println("Самая ранняя книга: " + shelf.getEarliestBook());
//
//        shelf.sortByYear();
//        System.out.println("\nКниги после сортировки по году:");
//        shelf.showAll();
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        String[] arr = {"один", "два", "три", "четыре", "пять"};
//
//        for (int i = 0; i < arr.length / 2; i++) {
//            String temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//
//        for (String s : arr) {
//            System.out.print(s + " ");
//        }
//    }
//}



//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
//        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
//
//        String[] deck = new String[52];
//        int index = 0;
//        for (String suit : suits) {
//            for (String rank : ranks) {
//                deck[index++] = rank + " " + suit;
//            }
//        }
//
//        for (int i = 0; i < deck.length; i++) {
//            int j = (int) (Math.random() * deck.length);
//            String temp = deck[i];
//            deck[i] = deck[j];
//            deck[j] = temp;
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество игроков: ");
//        int n = scanner.nextInt();
//
//        if (n < 1 || n * 5 > 52) {
//            System.out.println("Некорректное количество игроков.");
//            return;
//        }
//
//        int cardIndex = 0;
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Игрок " + i + ":");
//            for (int j = 0; j < 5; j++) {
//                System.out.println("  " + deck[cardIndex++]);
//            }
//            System.out.println();
//        }
//
//        scanner.close();
//    }
//}

//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите текст:");
//        String text = scanner.nextLine();
//
//        String[] words = text.trim().split("\\s+");
//
//        if (text.trim().isEmpty()) {
//            System.out.println("Вы ввели 0 слов.");
//        } else {
//            System.out.println("Вы ввели " + words.length + " слов.");
//        }
//
//        scanner.close();
//    }
//}