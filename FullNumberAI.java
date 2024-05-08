//Java Program (Можно обучить неправильно)
//File: FullNumberAI

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FullNumberAI {
    public static void main (String[] args) {

    //Генерируем в файл 9 нулей (если нужно)
    int ten = 1;
    String stroka0 = "0";
    String filePath0 = "NumberBase.txt";
    String filePathTest = "NumberBase.txt";
        File file = new File(filePathTest);
        if (file.length() == 0) {       //Проверяем длинну файла, генерируем только если файл пуст
            do {
                    String contentToAppend = stroka0;
                    try (FileWriter writer = new FileWriter(filePath0, true)) {
                        writer.write(contentToAppend + System.lineSeparator());
                        ten++;
                    } catch (IOException e) {
                        System.err.println("Произошла ошибка: " + e.getMessage());
                    }
            } while (ten != 10);
        }

        //НАЧАЛО
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это нейросеть которая может распозновать цифры от 1 до 9! При надобности надо будет обучить её!");

        String filePath = "NumberBase.txt"; //Файл
        int userNumber = 0; //Число пользователя
        int stroka = 0; //Переменная отвечает за нужную строчку из чтение файла
        int strokaHelp = 0; //Переменная, которая помогает прочитать нужный ряд
        int doWhile = 1; //Переменная, которая помогает остановить цикл

        do {

            //Пользователь вводит число
            System.out.println();
            System.out.print("Введите число: ");
            userNumber = scanner.nextInt();

            //Проверяем, число от 1 до 9 или нет, если нет то пишем что число должно быть от 1 до 9
            if (userNumber == 1 || userNumber == 2 || userNumber == 3 || userNumber == 4 || userNumber == 5 || userNumber == 6 || userNumber == 7 || userNumber == 8 || userNumber == 9) {
                //Читаем нужную строчку из файла C:\\Users\\danii\\OneDrive\\Рабочий стол\\Программы\\NumberAI\\NumberBase.txt
                stroka = userNumber;
                try (Scanner scanner2 = new Scanner(new File(filePath))) {
                    while (scanner2.hasNextLine() && strokaHelp != stroka) {
                        strokaHelp++;
                        String line = scanner2.nextLine();  //Строка с файлом (line)
                        if (strokaHelp >= stroka) {
                            String userNumberAsString = String.valueOf(userNumber); // Преобразование числа в строку
                            if (!line.equals("0")) {
                            System.out.println("Я знаю что ваше число это " + line);
                            } else {

                                //Проверяем число, какое оно должно быть (к примеру 3 должно быть 3)
                                System.out.println("Я не знаю такое число! Сейчас я задам пару вопросов, которые мне помогут узнать это число!");
                                Scanner scanner3 = new Scanner(System.in);
                                do {
                                    Random random = new Random();
                                    int randomNumber = random.nextInt(9) + 1;   //Генерируем рандомное число

                                    System.out.println();
                                    System.out.println("Ваше число " + randomNumber + " (Yes или No)?");
                                    String userAnswer = scanner3.nextLine();                               //Спрашиваем это число или нет

                                    if (userAnswer.equalsIgnoreCase("yes")) {

                                    //Переписываем нужную строчку из файла на нужное число
                                    switch (randomNumber){

                                        case 1:
                                        String filePath11 = "NumberBase.txt";
                                        String newContent11 = "" + randomNumber;
                                        int lineNumberToReplace11 = userNumber - 1;

                                        List<String> lines11 = new ArrayList<>();
                                        try (BufferedReader reader11 = new BufferedReader(new FileReader(filePath11))) {
                                            String line11;
                                            while ((line11 = reader11.readLine()) != null) {
                                                lines11.add(line11);
                                            }
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (1): " + e.getMessage());
                                            return;
                                        }
                                        lines11.set(lineNumberToReplace11, newContent11);

                                        try (BufferedWriter writer11 = new BufferedWriter(new FileWriter(filePath11))) {
                                            for (String line11 : lines11) {
                                                writer11.write(line11);
                                                writer11.newLine();
                                            }
                                            System.out.println("Я запомнил!");
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (2): " + e.getMessage());
                                        }
                                        break;

                                        case 2:
                                        String filePath22 = "NumberBase.txt";
                                        String newContent22 = "" + randomNumber;
                                        int lineNumberToReplace22 = userNumber - 1;

                                        List<String> lines22 = new ArrayList<>();
                                        try (BufferedReader reader22 = new BufferedReader(new FileReader(filePath22))) {
                                            String line22;
                                            while ((line22 = reader22.readLine()) != null) {
                                                lines22.add(line22);
                                            }
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (3): " + e.getMessage());
                                            return;
                                        }
                                        lines22.set(lineNumberToReplace22, newContent22);

                                        try (BufferedWriter writer22 = new BufferedWriter(new FileWriter(filePath22))) {
                                            for (String line22 : lines22) {
                                                writer22.write(line22);
                                                writer22.newLine();
                                            }
                                            System.out.println("Я запомнил!");
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (4): " + e.getMessage());
                                        }
                                        break;

                                        case 3:
                                        String filePath33 = "NumberBase.txt";
                                        String newContent33 = "" + randomNumber;
                                        int lineNumberToReplace33 = userNumber - 1;

                                        List<String> lines33 = new ArrayList<>();
                                        try (BufferedReader reader33 = new BufferedReader(new FileReader(filePath33))) {
                                            String line33;
                                            while ((line33 = reader33.readLine()) != null) {
                                                lines33.add(line33);
                                            }
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (5): " + e.getMessage());
                                            return;
                                        }
                                        lines33.set(lineNumberToReplace33, newContent33);

                                        try (BufferedWriter writer33 = new BufferedWriter(new FileWriter(filePath33))) {
                                            for (String line33 : lines33) {
                                                writer33.write(line33);
                                                writer33.newLine();
                                            }
                                            System.out.println("Я запомнил!");
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (6): " + e.getMessage());
                                        }
                                        break;

                                        case 4:
                                        String filePath44 = "NumberBase.txt";
                                        String newContent44 = "" + randomNumber;
                                        int lineNumberToReplace44 = userNumber - 1;

                                        List<String> lines44 = new ArrayList<>();
                                        try (BufferedReader reader44 = new BufferedReader(new FileReader(filePath44))) {
                                            String line44;
                                            while ((line44 = reader44.readLine()) != null) {
                                                lines44.add(line44);
                                            }
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (7): " + e.getMessage());
                                            return;
                                        }
                                        lines44.set(lineNumberToReplace44, newContent44);

                                        try (BufferedWriter writer44 = new BufferedWriter(new FileWriter(filePath44))) {
                                            for (String line44 : lines44) {
                                                writer44.write(line44);
                                                writer44.newLine();
                                            }
                                            System.out.println("Я запомнил!");
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (8): " + e.getMessage());
                                        }
                                        break;

                                        case 5:
                                        String filePath55 = "NumberBase.txt";
                                        String newContent55 = "" + randomNumber;
                                        int lineNumberToReplace55 = userNumber - 1;

                                        List<String> lines55 = new ArrayList<>();
                                        try (BufferedReader reader55 = new BufferedReader(new FileReader(filePath55))) {
                                            String line55;
                                            while ((line55 = reader55.readLine()) != null) {
                                                lines55.add(line55);
                                            }
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (9): " + e.getMessage());
                                            return;
                                        }
                                        lines55.set(lineNumberToReplace55, newContent55);

                                        try (BufferedWriter writer55 = new BufferedWriter(new FileWriter(filePath55))) {
                                            for (String line55 : lines55) {
                                                writer55.write(line55);
                                                writer55.newLine();
                                            }
                                            System.out.println("Я запомнил!");
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (10): " + e.getMessage());
                                        }
                                        break;

                                        case 6:
                                        String filePath66 = "NumberBase.txt";
                                        String newContent66 = "" + randomNumber;
                                        int lineNumberToReplace66 = userNumber - 1;

                                        List<String> lines66 = new ArrayList<>();
                                        try (BufferedReader reader66 = new BufferedReader(new FileReader(filePath66))) {
                                            String line66;
                                            while ((line66 = reader66.readLine()) != null) {
                                                lines66.add(line66);
                                            }
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (11): " + e.getMessage());
                                            return;
                                        }
                                        lines66.set(lineNumberToReplace66, newContent66);

                                        try (BufferedWriter writer66 = new BufferedWriter(new FileWriter(filePath66))) {
                                            for (String line66 : lines66) {
                                                writer66.write(line66);
                                                writer66.newLine();
                                            }
                                            System.out.println("Я запомнил!");
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (12): " + e.getMessage());
                                        }
                                        break;

                                        case 7:
                                        String filePath77 = "NumberBase.txt";
                                        String newContent77 = "" + randomNumber;
                                        int lineNumberToReplace77 = userNumber - 1;

                                        List<String> lines77 = new ArrayList<>();
                                        try (BufferedReader reader77 = new BufferedReader(new FileReader(filePath77))) {
                                            String line77;
                                            while ((line77 = reader77.readLine()) != null) {
                                                lines77.add(line77);
                                            }
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (13): " + e.getMessage());
                                            return;
                                        }
                                        lines77.set(lineNumberToReplace77, newContent77);

                                        try (BufferedWriter writer77 = new BufferedWriter(new FileWriter(filePath77))) {
                                            for (String line77 : lines77) {
                                                writer77.write(line77);
                                                writer77.newLine();
                                            }
                                            System.out.println("Я запомнил!");
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (14): " + e.getMessage());
                                        }
                                        break;

                                        case 8:
                                        String filePath88 = "NumberBase.txt";
                                        String newContent88 = "" + randomNumber;
                                        int lineNumberToReplace88 = userNumber - 1;

                                        List<String> lines88 = new ArrayList<>();
                                        try (BufferedReader reader88 = new BufferedReader(new FileReader(filePath88))) {
                                            String line88;
                                            while ((line88 = reader88.readLine()) != null) {
                                                lines88.add(line88);
                                            }
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (15): " + e.getMessage());
                                            return;
                                        }
                                        lines88.set(lineNumberToReplace88, newContent88);

                                        try (BufferedWriter writer88 = new BufferedWriter(new FileWriter(filePath88))) {
                                            for (String line88 : lines88) {
                                                writer88.write(line88);
                                                writer88.newLine();
                                            }
                                            System.out.println("Я запомнил!");
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (16): " + e.getMessage());
                                        }
                                        break;

                                        case 9:
                                        String filePath99 = "NumberBase.txt";
                                        String newContent99 = "" + randomNumber;
                                        int lineNumberToReplace99 = userNumber - 1;

                                        List<String> lines99 = new ArrayList<>();
                                        try (BufferedReader reader99 = new BufferedReader(new FileReader(filePath99))) {
                                            String line99;
                                            while ((line99 = reader99.readLine()) != null) {
                                                lines99.add(line99);
                                            }
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (17): " + e.getMessage());
                                            return;
                                        }
                                        lines99.set(lineNumberToReplace99, newContent99);

                                        try (BufferedWriter writer99 = new BufferedWriter(new FileWriter(filePath99))) {
                                            for (String line99 : lines99) {
                                                writer99.write(line99);
                                                writer99.newLine();
                                            }
                                            System.out.println("Я запомнил!");
                                        } catch (IOException e) {
                                            System.err.println("Произошла ошибка (18): " + e.getMessage());
                                        }
                                        break;
                                    }

                                        doWhile = 2;  //действия если то число
                                    }
                                    if (userAnswer.equalsIgnoreCase("no")) {
                                        System.out.println("Хорошо, это не ваше число!");
                                        doWhile = 1;  //действия если не то число
                                    }
                                    if (!userAnswer.equalsIgnoreCase("yes") && !userAnswer.equalsIgnoreCase("no")) {
                                        System.out.println("Я не понимаю вашего ответа!");
                                        doWhile = 1;         //Если ответ не Yes и не No
                                    }

                                } while (doWhile == 1);

                            }
                        }
                    }
                } catch (FileNotFoundException e) {
                    System.err.println("Произошла ошибка (19): " + e.getMessage());
                        }
                strokaHelp = 0;

            } else {
            System.out.println("Число должно быть от 1 до 9!");
            }

        } while (1 == 1);
    }
}
