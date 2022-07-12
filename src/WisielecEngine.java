import java.util.Random;

public class WisielecEngine {
Random randomWord = new Random();
String[][] wordsBase = {{"Zoya"}, {"Norek"}, {"Frida"}, {"Louis"}, {"Pedro"}};
String wordToGuess;

public void wordDraw(){
int randomNumber = randomWord.nextInt(wordsBase.length);
wordToGuess = wordsBase[randomNumber][0];
}

public void wisielecEngine(){
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    wordDraw();
    WisielecFrame wisielecFrame = new WisielecFrame();
    wisielecFrame.centralLabel1.setText("Imię zwierzaka do odgadnięcia składa się z " + wordToGuess.length() + " liter.");

    if (wordToGuess.length() == 3){
        wisielecFrame.centralLabel2.setText("_   _   _");}
    if (wordToGuess.length() == 4){
        wisielecFrame.centralLabel2.setText("_   _   _   _");}
    if (wordToGuess.length() == 5){
        wisielecFrame.centralLabel2.setText("_   _   _   _   _");}
}

}
