package com.delta.controlflow;

import android.util.Log;

/**
 * Created by learnovate on 2/27/14.
 */
public class ControlFlow {

    char[] alphabet = {
        'a','b','c','d','e','f','g','h','i','j','k','l','m',
        'n','o','p','q','r','s','t','u','v','w','x','y','z'
    };

    // English-language pangram tester
    // "Pack my box with five dozen liquor jugs."
    // "Mr. Jock, TV quiz PhD, bags few lynx."
    // "The quick red fox jumps over the lazy brown dog"

    public void start() {

        char[] sentenceToTest =
                toCharacterArray("The quick red fox jumps over the lazy brown dog");

        char[] missingLetters = new char[26];

        // start here!

        // Find out if the 'sentenceToTest' is in fact a pangram.
        // then make a writeSuccess method call with the following pieces of data:
        // 1. number of missing letters (if any)
        // 2. which letters (if any)
        // 3. the original sentence
        // writeSuccess(int aNumMisssing, char[] aMissingLetters, char[] aSentence)
    }

    // This code is just to help us write easier to read code
    // it turns "sentence" into a char array of {'s','e','n','t','e','n','c','e'}

    public char[] toCharacterArray(String s) {
        if (s == null) {
            return null;
        }

        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }

        return array;
    }

    public void writeToLog(int output) {
        Log.e("OPERATOR", String.valueOf(output));
    }

    public void writeToLog(String output) {
        Log.e("OPERATOR", String.valueOf(output));
    }

    public void writeSuccess(int aNumMisssing,
