package TemplateMethod.FileProcessor;

public class Application {

  public static void main(String[] args) {
    FileProcessor fileProcessor = new FileProcessor("number.txt");
    int result = fileProcessor.process((sum, number) -> sum *= number);
    System.out.println(result);
  }

}
