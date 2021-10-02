package com.kodilla.stream;

import com.kodilla.stream.beautifier.*;

public class StreamMain1 {
    public static void main(String[] args) {
        PoemBeatifier poemBeatifier = new PoemBeatifier();
        poemBeatifier.beatify("Ala ma kota", "***", (text, decoratorLambda) -> decoratorLambda + text + decoratorLambda);
        poemBeatifier.beatify("Ala ma kota", "$", (text, decoratorLambda) -> decoratorLambda + text.toLowerCase() + decoratorLambda);
        poemBeatifier.beatify("Ala ma kota", "^", (text, decoratorLambda) -> decoratorLambda + text.toUpperCase() + decoratorLambda);
        poemBeatifier.beatify("Ala ma kota", "^", (text, decoratorLambda) -> decoratorLambda + text.replace("kota", "psa") + decoratorLambda);

    }
}
