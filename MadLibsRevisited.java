import java.util.Scanner;
public class MadLibsRevisited {
   //instance variables
   private String[] nouns;
   private String[] pluralNouns;
   private String[] verbs;
   private String[] verbsEndingInING;
   private String[] adjectives;
   private String[] adverbs;
   private String[] interjections;
   private String[] places;
   private String[] bodyParts;
   Scanner in = new Scanner(System.in);
   //constructor
   public MadLibsRevisited()
   {
      //Initialize the arrays nouns, verbs, adjectives, adverbs, and interjections and fill them with user input.
      nouns = new String[13];
      for(int i = 0; i < nouns.length; i++)
      {
         System.out.print("Please enter a noun: ");
         nouns[i] = in.nextLine();
      }
      pluralNouns = new String[2];
      for(int i = 0; i < pluralNouns.length; i++)
      {
         System.out.print("Please enter a plural noun: ");
         pluralNouns[i] = in.nextLine();
      }
      verbs = new String[4];
      for(int i = 0; i < verbs.length; i++)
      {
         System.out.print("Please enter a verb: ");
         verbs[i] = in.nextLine();
      }
      verbsEndingInING = new String[2];
      for(int i = 0; i < verbsEndingInING.length; i++)
      {
         System.out.print("Please enter a verb ending in -ing: ");
         verbsEndingInING[i] = in.nextLine();
      }
      adjectives = new String[3];
      for(int i = 0; i < adjectives.length; i++)
      {
         System.out.print("Please enter an adjective: ");
         adjectives[i] = in.nextLine();
      }
      adverbs = new String[0];
      for(int i = 0; i < adverbs.length; i++)
      {
         System.out.print("Please enter an adverb: ");
         adverbs[i] = in.nextLine();
      }
      interjections = new String[0];
      for(int i = 0; i < interjections.length; i++)
      {
         System.out.print("Please enter an interjection: ");
         interjections[i] = in.nextLine();
      }
      places = new String[2];
      for(int i = 0; i < places.length; i++)
      {
         System.out.print("Please enter a place: ");
         places[i] = in.nextLine();
      }
      bodyParts = new String[0];
      for(int i = 0; i < bodyParts.length; i++)
      {
         System.out.print("Please enter a body part: ");
         bodyParts[i] = in.nextLine();
      }
   }

   //getter methods
   private void printNouns()
   {
      //Print the list of nouns in one line.
      System.out.print("Nouns: ");
      for (String x: nouns)
         System.out.print(x + " ");
   }

   private void printPluralNouns()
   {
      //Print the list of nouns in one line.
      System.out.print("Plural Nouns: ");
      for (String x: pluralNouns)
         System.out.print(x + " ");
   }

   private void printVerbs()
   {
      //Print the list of verbs in one line.
      System.out.print("Verbs: ");
      for (String x: verbs)
         System.out.print(x + " ");
   }

   private void printVerbsEndingInING()
   {
      //Print the list of verbs in one line.
      System.out.print("Verbs ending in -ing: ");
      for (String x: verbsEndingInING)
         System.out.print(x + " ");
   }

   private void printAdjectives()
   {
      //Print the list of adjectives in one line.
      System.out.print("Adjectives: ");
      for (String x: adjectives)
         System.out.print(x+" ");
   }

   private void printAdverbs()
   {
      //Print the list of adverbs in one line.
      System.out.print("Adverbs: ");
      for (String x: adverbs)
      System.out.print(x + " ");
   }

   private void printInterjections()
   {
      //Print the list of interjections in one line.
      System.out.print("Interjections: ");
      for (String x: interjections)
         System.out.print(x+" ");
   }

   private void printPlaces()
   {
      //Print the list of interjections in one line.
      System.out.print("Places: ");
      for (String x: places)
         System.out.print(x + " ");
   }

   private void printBodyParts()
   {
      //Print the list of verbs in one line.
      System.out.print("Body Parts: ");
      for (String x: bodyParts)
         System.out.print(x + " ");
   }

   public void printLists()
   {
      //Print all of the lists out in separate lines.
      printNouns();
      System.out.println();
      printPluralNouns();
      System.out.println();
      printVerbs();
      System.out.println();
      printVerbsEndingInING();
      System.out.println();
      printAdjectives();
      System.out.println();
      printAdverbs();
      System.out.println();
      printInterjections();
      System.out.println();
      printPlaces();
      System.out.println();
      printBodyParts();
      System.out.println();
   }

   //mutator methods
   public String createStory()
   {
      //Type out your story with the parts of speech in the story where they should be filled in.
      String story = "Ok so I was VerbEndingInING! I'm a kid, I'm supposed to snoop, especially around noun time! What noun doesn't snoop? I just so happened to be in our place. Normally I'm not up there, it's adjective and adjective. Plus there are pluralNoun, yuck! I couldn't help myself! There it was right by my little sister's old noun. Guess noun didn't think I would verb it. I verb it, it felt adjective. Should I verb it? Looking closer I saw some pluralNoun. I got even closer and verb a noun! The hidden noun was alive! A yelp cam from the noun. I opened the noun and to my surprise a noun was inside! Guess who else was hidden in the place? noun and noun just knew i was VerbEndingInING!";
      //Find the index of the first time "noun" in appears story
      int nounIndex = story.indexOf("noun");
      //Set i = 0 to get the first noun in the list nouns
      int i = 0;
      /*Create a loop that will run until "noun" no longer appears in story or there are no more nouns
       *in the nouns list*/
      while(nounIndex >= 0 && i < nouns.length)
      {
         //Replace "noun" with one of the nouns in the nouns list
         story = story.substring(0, nounIndex)+nouns[i]+story.substring(nounIndex+4);
         //Find the next time "noun" appears in story
         nounIndex = story.indexOf("noun", nounIndex+4);
         //Increment i to get to the next noun in the list
         i++;
      }
      //Find the index of the first time "pluralNoun" in appears story
      int pluralNounIndex = story.indexOf("pluralNoun");
      //Reset i = 0 to get the first plural nouns in the list pluralNouns
      i = 0;
      /*Create a loop that will run until "pluralNouns" no longer appears in story or there are no more plural nouns
       *in the pluralNouns list*/
      while(pluralNounIndex >= 0 && i < pluralNouns.length)
      {
         //Replace "pluralNouns" with one of the plural nouns in the pluralNoun list
         story = story.substring(0, pluralNounIndex) + pluralNouns[i] + story.substring(pluralNounIndex + 10);
         //Find the next time "pluralNoun" appears in story
         pluralNounIndex = story.indexOf("pluralNoun", pluralNounIndex + 10);
         //Increment i to get to the next plural noun in the list
         i++;
      }
      //Find the index of the first time "verb" appears in story
      int verbIndex = story.indexOf("verb");
      //Reset i = 0 to get the first verb in the list verbs
      i = 0;
      /*Create a loop that will run until "verbs" no longer appears in story or there are no more verbs
       *in the verbs list*/
      while(verbIndex >= 0 && i < verbs.length)
      {
         //Replace "verb" with one of the verbs in the verbs list
         story = story.substring(0, verbIndex) + verbs[i] + story.substring(verbIndex + 4);
         //Find the next time "verb" appears in story
         verbIndex = story.indexOf("verb", verbIndex + 4);
         //Increment i to get to the next verb in the list
         i++;
      }
      //Find the index of the first time "verbEndingInING" appears in story
      int verbEndingInINGIndex = story.indexOf("VerbEndingInING");
      //Reset i = 0 to get the first verb ending in -ing in the list verbsEndingInING
      i = 0;
      /*Create a loop that will run until "verbEndingInING" no longer appears in story or there are no more verbs ending
       *in -ing in the verbsEndingInING list*/
      while(verbEndingInINGIndex >= 0 && i < verbsEndingInING.length)
      {
         //Replace "verbEndingInING" with one of the verbs ending in -ing in the verbsEndingInING list
         story = story.substring(0, verbEndingInINGIndex) + verbsEndingInING[i] + story.substring(verbEndingInINGIndex + 15);
         //Find the next time "verbEndingInING" appears in story
         verbEndingInINGIndex = story.indexOf("VerbEndingInING", verbEndingInINGIndex + 15);
         //Increment i to get to the next verb ending in -ing in the list
         i++;
      }
      //Find the index of the first time "adjective" appears in story
      int adjectiveIndex = story.indexOf("adjective");
      //Reset i = 0 to get the first adjective in the list adjectives
      i = 0;
      /*Create a loop that will run until "adjectives" no longer appears in story or there are no more adjectives ending
       *in the adjectives list*/
      while(adjectiveIndex >= 0 && i < adjectives.length)
      {
         //Replace "adjective" with one of the adjectives in the adjectives list
         story = story.substring(0, adjectiveIndex) + adjectives[i] + story.substring(adjectiveIndex + 9);
         //Find the next time "adjective" appears in story
         adjectiveIndex = story.indexOf("adjective", adjectiveIndex + 9);
         //Increment i to get to the next adjective in the list
         i++;
      }
      //Find the index of the first time "adverb" appears in story
      int adverbIndex = story.indexOf("adverb");
      //Reset i = 0 to get the first adverb in the list adverbs
      i=0;
      /*Create a loop that will run until "adverbs" no longer appears in story or there are no more adverbs
       *in the adverbs list*/
      while(adverbIndex >= 0 && i < adverbs.length)
      {
         //Replace "adverb" with one of the adverbs in the adverb list
         story = story.substring(0, adverbIndex) + adverbs[i] + story.substring(adverbIndex + 6);
         //Find the next time "adverb" appears in story
         adverbIndex = story.indexOf("adverb", adverbIndex + 6);
         //Increment i to get to the next adverb in the list
         i++;
      }
      //Find the index of the first time "interjection" appears in story
      int interjectionIndex = story.indexOf("interjection");
      //Reset i = 0 to get the first interjection in the list interjections
      i=0;
      /*Create a loop that will run until "interjection" no longer appears in story or there are no more interjections
       *in the interjections list*/
      while(interjectionIndex >= 0 && i < interjections.length)
      {
         //Replace "interjection" with one of the interjections in the interjections list
         story = story.substring(0, interjectionIndex) + interjections[i] + story.substring(interjectionIndex + 12);
         //Find the next time "interjections" appears in story
         interjectionIndex = story.indexOf("interjection", interjectionIndex + 12);
         //Increment i to get to the next interjection in the list
         i++;
      }
      //Find the index of the first time "place" appears in story
      int placeIndex = story.indexOf("place");
      //Reset i = 0 to get the first place in the list places
      i=0;
      /*Create a loop that will run until "place" no longer appears in story or there are no more places
       *in the places list*/
      while(placeIndex >= 0 && i < places.length)
      {
         //Replace "place" with one of the places in the places list
         story = story.substring(0, placeIndex) + places[i] + story.substring(placeIndex + 5);
         //Find the next time "place" appears in story
         placeIndex = story.indexOf("place", placeIndex + 5);
         //Increment i to get to the next place in the list
         i++;
      }
      //Find the index of the first time "bodyPart" appears in story
      int bodyPartIndex = story.indexOf("bodyPart");
      //Reset i = 0 to get the first body part in the list bodyParts
      i = 0;
      /*Create a loop that will run until "bodyPart" no longer appears in story or there are no more body parts
       *in the bodyParts list*/
      while(bodyPartIndex >= 0 && i < bodyParts.length)
      {
         //Replace "bodyPart" with one of the body parts in the bodyParts list
         story = story.substring(0, bodyPartIndex) + bodyParts[i] + story.substring(bodyPartIndex + 8);
         //Find the next time "bodyPart" appears in story
         bodyPartIndex = story.indexOf("bodyPart", bodyPartIndex + 8);
         //Increment i to get to the next body part in the list
         i++;
      }
      //return story
      return story;
   }
}