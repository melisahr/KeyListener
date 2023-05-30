# KeyListener
The project is a follow along YouTube video using the Java language. 

What it does?
It moves the rocket image with the keys. The keys are either by the letters or arrows. 

How it was made:
Use the switch statement to assign the keys to move ten spaces. Implement a KeyListener with the three methods: KeyTyped, KeyPressed, and KeyReleased. 
Inside the KeyTyped and KeyPressed, each had a switch statement. For the Keytyped, assign the letter keys to move ten places in a specific direction. The letters
are "a" goes left, "w" goes up, "s" goes down, and "d" goes right. For the KeyPressed, use key arrows. The key arrows does not produce a key character but a code instead.
So to get this code, use System.out.println("You get: "+e.getKeyCode()); in the KeyReleased method. After getting codes, use 37 goes "left", 38 goes "up", 39 goes "right", 
and 40 goes "left". For the rocket image, I was able to get a free icon from the website called: Icons8. 



