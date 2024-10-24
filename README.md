# Virgil (Java)

jvirgil is the first attempt at this concept. This "beta" is written entirely in Java and is more of proof-of-concept that I can get this thing working. The goal is to have it all in C and up in the AUR.

All my friends know I love movies, and my oldest friends know I love books. I've become increasingly attracted to good writing. I've kept a running document of my favorite quotes from friends, familiy, and notable pieces of cinema and literature, the problem is I can only relive this snippets when I look for them. Virgil is command-line based tool to record, edit, and store these snippets and display them in my terminal whenever I open it for the first time [that day, every 12 hours? every session TBD]. Now i have to figure out how to do that.

# Installation

Who knows. LEARN how to make packages.

# Usage

use ```virgil --help``` to print the list of supported commands.

# JVIRGIL OBJECTIVES

> Have a continuous program that can CREATE, ADD, DELETE, and UPDATE different quotes stored as text files in a directory
> Keep a legend of currently tracked quotes in a file called "lexicon"
> Don't worry about proper code practice, just hve something running for V2

# To-Do

## -- In General --

-- figure out how to write actual tests?

## -- Main.java --

** change input checking parts to depend on the array rather than hardcoded inputs **
** add else if, else statements to account for basic arguments **
** check if the input line is calling virgil at all **

- implement CREATEing quote to lexicon & manuscripts
- implement ADDing quote to lexicon & manuscripts
- implement UPDATEing quote from lexicon & manuscripts
- implement DELETEing quote from lexicon & manuscripts
- write manuals for other methods

## -- Quote.java --

- figure out how to stylize the outputs of the 'man' page to highlight/bold certain keywords fo the user
- change the commands so that they take in the actual flags instead of the extra words

## -- Lexicon.java --

- write append method + implement in main
- write update method + implement to main
- write delete method + implement to main

# V2 Notes

> new class to control commands? feed gpt "im building a terminal application, how do i create a class of supported commands in java" and observe the proposed interface
> work to use more bash commands instead of hardcoding certain methods in java

08-11-24
going to put a close to jvirgil and stop procrastinating. I'll start practicing C and figure out how to build this out the way I want instead of scrapping and making this thing messier and messier. it's been real.
