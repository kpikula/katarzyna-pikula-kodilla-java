package com.kodilla.stream.beautifier;

public class PoemBeatifier {

    public void beatify(String text, String decoratedLambda, PoemDecorator poemDecorator) {
        String beatifiedText = poemDecorator.decorate(text, decoratedLambda);
        System.out.println("Beatified text: " + beatifiedText);
    }
}
