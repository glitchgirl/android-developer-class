ControlFlow.java
1: package com.delta.controlflow; 2:
3: import android.util.Log; 4:
5: /**
6: * Created by learnovate on 2/27/14. 7: */
8: public class ControlFlow { 9:
                                                         spawrks 09/18/14
1-1/2(1)
10: char[] alphabet = {’a’,’b’,’c’,’d’,’e’,’f’,’g’,’h’,’i’,’j’,’k’,’l’,’m’,’n’,’o’,’p’,’q’,’r’,’s’,’t’,’u’,’v’,’w’,’x’,’y’, ’z’};
11:
12: //English-language pangram tester 13:
14: //"Pack my box with five dozen liquor jugs."
15: //"Mr. Jock, TV quiz PhD, bags few lynx."
16: //"The quick red fox jumps over the lazy brown dog""
17:
18: public void start(){
19:
20:
char[] sentenceToTest = toCharacterArray("The quick red fox jumps over the lazy brown dog"); 21:
char[] missingLetters = new char[26];
22:
23:
//start here!
24:
25:
26:
27:
28:
29:
30:
31:
// Find out if the ’sentenceToTest’ is in fact a pangram.
32:
// then make a "writeSuccess" method call with the following pieces of data: 33:
// 1. number of missing letters (if any)
34:
// 2. which letters (if any)
35:
// 3. the original sentence
36:
//writeSuccess(int aNumMisssing, char[] aMissingLetters, char[] aSentence ) 37:
38:
39:
40:
41: }
42:
43:
44:
45:
46: //
47: // This code is just to help us write easier to read code

ControlFlow.java spawrks 09/18/14 1-2/2(2)
48: // it turns "sentence" into a char array of {’s’,’e’,’n’,’t’,’e’,’n’,’c’,’e’} 49: // 50: 51: public char[] toCharacterArray(String s) {
if (s == null) { 52:
return null; 53:
}
54:
char[] array = new char[s.length()]; 55:
for (int i = 0; i < s.length(); i++) { 56:
array[i] = s.charAt(i); 57:
}
58:
59:
return array; 60: }
61:
62: public void writeToLog(int output){
Log.e("OPERATOR",String.valueOf(output)); 63:
64: }
65: public void writeToLog(String output){
Log.e("OPERATOR",String.valueOf(output)); 66:
67: }
68:
public void writeSuccess(int aNumMisssing, char[] aMissingLetters, char[] aSentence ){ 69:
70:
71:
Log.e("OPERATOR","testing sentence:" + String.valueOf(aSentence)); String message = String.valueOf(aNumMisssing) + " missing:" + String.valueOf(aMissingLetters); 72:
Log.e("OPERATOR",message);
73:
74: }
   75:
   76:
   77:
   78:
79: }

ControlFlowActivity.java
1: package com.delta.controlflow; 2:
3: import android.app.Activity; 4: import android.os.Bundle; 5: import android.view.Menu; 6: import android.view.MenuItem; 7:
                                                         spawrks 09/18/14
2-1/1(3)
8: public class ControlFlowActivity extends Activity {
9:
10:     @Override
protected void onCreate(Bundle savedInstanceState) { 11:
12: super.onCreate(savedInstanceState); setContentView(R.layout.activity_control_flow); 13:
14:
ControlFlow cf = new ControlFlow(); cf.start();
15:
16: }
17:
18:
19:     @Override
20:
21:
22:
23:
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.control_flow, menu); return true;
24:
25: }
26:
27: @Override
28: public boolean onOptionsItemSelected(MenuItem item) {
29:
30:
31:
32:
33:
34:
35:
36:
37:     }
38:
39: }
// Handle action bar item clicks here. The action bar will // automatically handle clicks on the Home/Up button, so long // as you specify a parent activity in AndroidManifest.xml. int id = item.getItemId();
if (id == R.id.action_settings) {
return true;
}
return super.onOptionsItemSelected(item);

Table of Contents spawrks 09/18/14 -1/1(4)
  1 controlflow/src/main/java/com/delta/controlflow/ControlFlow.java   2 pages   79 lines  14/03/17 20:34:16
  2 controlflow/src/main/java/com/delta/controlflow/ControlFlowActivity.java   1 pages   39 lines  14/03/01 19:57:55
