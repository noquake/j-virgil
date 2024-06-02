# Virgil (JB)

Virgil JB is the first build. This Beta version is written entirely in Java + Bash and is more of proof-of-concept that I can get this thing working.

All my friends know I love movies, and my older friends know I love books. Through these arts, I've become increasingly attracted to good writing. Since middle school I've kept a running document of my favorite quotes from friends, familiy, and notable pieces of cinema and literature, the problem is I can only relive this snippets when I look for them. Virgil is command-line based tool to record, edit, and store these snippets and display them in my terminal.

# JB/BETA OBJECTIVES

> Have a continuous program that can CREATE, ADD, DELETE, and UPDATE different quotes stored as text files in a directory
> Keep a legend of currently tracked quotes in a file called "lexicon"
> Don't worry about proper code practice, just hve something running for V2

# To-Do

## -- In General --

-- look into writing actual tests?

## -- Main.java --

** change input checking parts to depend on the array rather than hardcoded inputs **
** add else if, else statements to account for basic arguments **
** check if the input line is calling virgil at all **
-- implement CREATEing quote to lexicon & manuscripts
-- implement ADDing quote to lexicon & manuscripts
-- implement UPDATEing quote from lexicon & manuscripts
-- implement DELETEing quote from lexicon & manuscripts

## -- Quote.java --

--

## -- Lexicon.java --

-- write append method + implement in main
-- write update method + implement to main
-- write delete method + implement to main

# V2 Notes

> new class to control commands? feed gpt "im building a terminal application, how do i create a class of supported commands in java" and observe the proposed interface
> work to use more bash commands instead of hardcoding certain methods in java
