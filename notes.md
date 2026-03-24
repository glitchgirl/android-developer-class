Genreal Notes
this is the class link:
https://www.udemy.com/course/become-an-android-developer-from-scratch/learn/lecture/1046310#overview

Janaury 27 notes:
- welcome video
- why andriod studio
  - java is complicated LOL
- the best tools to use
  - you can use the emulator in the studio
  - physical device
  - paid service (geny) 
- Section 1: Reading Java Find the clues in the code
  - Say goodbye to "hello world"

Jan 28 Notes:
- From application to code
- Files, classes, applications, methods
- Syntax symbols 
  - note about how this is the thing most new devs struggle with (agreed!!!)
- Method signatures

Jan 29 Notes:
- Data types, variables
- Memory lockers

Feb 4 Notes:
- Introduction to computer memory
  - primitive versus refernece 
- Computer memory: Primitives
  - i like that he shows all the zeros for how much data each type stores
- Computer memory: references and null
  - using an array to talk about references is helpful i think 
  - off by one errors
  - everything that isn't primitive gets set to a null pointer at first 
- Android Studio: Out of the box
- Android Studio: First look
  - remember to open the main project folder, not one of the nested ones
  - open settings and click on build number a bunch of times to open dev mode on androids
  - i tried to download the demo files but they didn't work. sad.

Feb 9 Notes:
- Arrays
- Lists
  - arrayList, linkedList, Vector
- Sets
- Maps
- Objects vs New

Feb 10 Notes:
- Constructors and Allocation
- Garabage collection and "null"
- Operators and Assignments: bitwise and unary
- The return statement
- The if statement
- else / else if
- The for loop

Feb 12 Notes:
- Nested For loops
- While loop
- The break and continue statements
- The switch statement
- Compiling and debugging
- What's first, next, later: Interpreting control flow statements

Feb 16 Notes:
- Stack vs heap
  - if we are in the same block of code we use the same stack (used for pointers and primitives) but seperate blocks use different stacks. We also can't put objects in stacks
  - garabage collection removes stuff from the heap that no longers has a pointer

Feb 17 Notes:
- Encapsulation and "thisness"
- scope and Accessibility keywords
- Setters getters and autogeneration
    - cool that android studio can auto do these now
- Inheritance, Polymorphism, "@override" and "super"

Feb 18 Notes:
- The static and final keywords
  - when something is final it can't be overwritten (const)
  - static ~ "shared" class v object
- Using enhanced loops (for each) in collections
  ```java
  for(Joke joke : jokesIKnow) {
    print(joke);
  }
  ```
- code along

Feb 19 Notes:
- All these powerful tools!
- Abstract classes
  - uses the idea of a "sketch" of what we want
- interface
  - uses the keyword interface
  -  kind of like a "contract"
  -  class can only extend one class, but as many interfaces as we want
-  callbacks with interfaces
  - watch for memory leaks!! 

Feb 23 Notes:
- Typecasting
- Generics
- code along

Feb 24 Notes:
- The super 6:: Mobile design principles
  - 0 who
  - 1 cues (how do we tell the user what to do?)
  - 2 fingers
  - 3 clean design (use default layouts)
  - 4 color size shape
  - 5 feedback
- XML Basics
  - nested (closes with the name)
  - indivual (closes with /)
  - linear layouts are kind of like grid/ grid box
- Introduction to layouts
  - don't import "R"
  - use relative when possible
- Linear layouts
- Relative layouts

 Feb 25 Notes:
 - Margins and paddings
 - Gravity and gravity layouts
 - Adding images
 - Event listeners using anon callbacks

Feb 26 Notes:
- code along

March 2 Notes:
- Activities and Intent Basics
- Android activity lifecycle
  - https://developer.android.com/guide/components/activities/activity-lifecycle
- Code along

March 4 Notes:
- code along

March 9 Notes:
- Intent filters and implicit intents
  - we can now use other peoples code (camera, phone, etc)
  - our code can be used by other people (open stuff in our app)   
- code along

March 10 Notes:
- code along
- Introduction to list views
- Basic list views

March 17 Notes:
- code along
- Listviews with custom adapters
- code along

March 18 Notes:
- code along
- Using the holder pattern and view tags

March 23 Notes:
- code along (professional list views)

March 24 Notes:
- Phones, tables, "phablets", fragmetns and mulitple devices
  - kind of like activites but backwards compabitable / screens
- TCFE: try, catch, finally, exception
- The fragment lifecycle
  - reviewed the activity lifecycle
  - fragment is close (adds onAttach and OnDeatch)
- Handling communication between fragments
