package compilator;

import java.util.Scanner;

public class Language {
    public Compiler createCompiler(){
        //Меню выбора языка программирования
        Scanner in = new Scanner(System.in);
            System.out.println("Меню выбора:"
                    + System.lineSeparator() + "1.Java"
                    + System.lineSeparator() + "2.C"
                    + System.lineSeparator() + "3.Python");
            System.out.print("Выберите язык: ");
            int languageName = in.nextInt();
            switch (languageName) {
                case 1:
                    //Метод создания объекта Java компилятора
                    return createJavaCompiler();
                case 2:
                    //Метод создания объекта C компилятора
                    return createCCompiler();
                case 3:
                    //Метод создания объекта Python компилятора
                    return createPythonCompiler();
                default:
                    System.out.println("Введен неподдерживаемый компилятором язык программирования!");
                    return null;
            }              
    }
    public JavaCompiler createJavaCompiler(){
        //Возвращаем созданный объект класса JavaCompiler
        return new JavaCompiler();
    }

    public CCompiler createCCompiler(){
        //Возвращаем созданный объект класса CCompiler
        return new CCompiler();
    }

    public PythonCompiler createPythonCompiler(){
        //Возвращаем созданный объект класса PythonCompiler
        return new PythonCompiler();
    }
}