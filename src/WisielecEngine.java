import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class WisielecEngine implements ActionListener {
Random randomWord = new Random();
ArrayList<Character> lettersFromWordToGuess = new ArrayList<>();
ArrayList<String> lettersGuessed = new ArrayList<>();
WisielecFrame wisielecFrame = new WisielecFrame();
    String[][] wordsBase = {{"ab"}};
//String[][] wordsBase = {{"Zoya"}, {"Norek"}, {"Frida"}, {"Louis"}, {"Pedro"}};
String wordToGuess;
String wordToGuessLowCa;
boolean chanceToGuess = true;
int wrongAnswerCounter = 1;
int correctAnswerCounter = 1;

    public void wisielecEngine(){
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    wordDraw();

    wisielecFrame.centralLabel1.setText("Imię zwierzaka do odgadnięcia składa się z " + wordToGuess.length() + " liter.");

    if (wordToGuess.length() == 3){
        wisielecFrame.centralLabel2.setText("_   _   _");}
    if (wordToGuess.length() == 4){
        wisielecFrame.centralLabel2.setText("_   _   _   _");}
    if (wordToGuess.length() == 5){
        wisielecFrame.centralLabel2.setText("_   _   _   _   _");}

    wisielecFrame.button.addActionListener(this);
    }
public void wordDraw(){
    int randomNumber = randomWord.nextInt(wordsBase.length);
    wordToGuess = wordsBase[randomNumber][0];
    wordToGuessLowCa = wordToGuess.toLowerCase();

    for (int i = 0; i<wordToGuessLowCa.length(); i++){
        lettersGuessed.add("_");}

    for (int i = 0; i<wordToGuessLowCa.length(); i++){
        lettersFromWordToGuess.add(wordToGuessLowCa.charAt(i));
    }

    System.out.println(wordToGuess);
}
public void wordGuessing() {

if (chanceToGuess){
    String letterChosen = wisielecFrame.textField.getText();
 if(!letterChosen.equals("")){
    if (wordToGuessLowCa.contains(letterChosen)) {
        wisielecFrame.centralLabel1.setText("Świetnie!, litera znajduje się w imieniu do odgadnięcia");
        wisielecFrame.textField.setText("");

        //tu sprawdzam ile razy dana litera występuje w słowie
        for (int i = 0; i<lettersFromWordToGuess.size(); i++) {
            if (letterChosen.equals(Character.toString(lettersFromWordToGuess.get(i)))){
                lettersGuessed.set(i, letterChosen);
            }
        }
        wisielecFrame.centralLabel2.setText(printArray());
        correctAnswerCheck(correctAnswerCounter++);

    } else {
        //System.out.println("Litera nie znajduje się w imieniu do odgadnięcia");
        wisielecFrame.textField.setText("");
        wrongAnswerCheck(wrongAnswerCounter++);
    }
 }
}}
public void correctAnswerCheck(int correctAnswerCounter){
        if(correctAnswerCounter==wordToGuess.length()){
            new WisielecWinFrame();
            chanceToGuess = false;
        }
    }
public void wrongAnswerCheck(int wrongAnswerCounter){
        if(wrongAnswerCounter==1){
        wisielecFrame.centralLabel1.setText("Podana litera jest nieprawidłowa. Zostały Ci jeszce dwie próby");
        }

        if(wrongAnswerCounter==2){
        wisielecFrame.centralLabel1.setText("Podana litera jest nieprawidłowa. Została Ci ostatnia próba");
        }

        if(wrongAnswerCounter==3){
        wisielecFrame.centralLabel1.setText("Przegrałeś!!! :P   Spróbuj jeszcze raz :)");
        chanceToGuess = false;
    }
}
public String printArray(){
    String temp = "";
    for(int i=0; i<lettersGuessed.size(); i++){
    temp = temp + lettersGuessed.get(i) + "   ";
    }
    return temp;
}
    @Override
    public void actionPerformed(ActionEvent e) {
    wordGuessing();}
}
