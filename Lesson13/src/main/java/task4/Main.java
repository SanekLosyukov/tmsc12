package task4;

public class Main {
    public static void main(String[] args) throws Exception {
        TextUtils textUtils = new TextUtils();
        String text = "Тестовый текст. Он написан через точки. С ним и будем проводить действия. Поехали. По условию задачи добавим в текст слово полиндром казак";
        textUtils.numberOfWordsInString(text);
        textUtils.searchPolydrome(text);

    }
}
