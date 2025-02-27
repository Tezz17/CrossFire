package com.krsolutions.crossFire

import java.util.*
import kotlin.collections.ArrayList

data class Question(
    val question: String,
    val isTrue: Boolean,
    val errMessage: String
)

object QuestionsBank {
    private val questions: ArrayList<Question> = arrayListOf(
        Question(
            "The Government spends exactly ₹1 coin to manufacture a one rupee coin",
            false,
            "The average cost of manufacturing a single one rupee coin is ₹1.11."
        ),
        Question(
            "Apartheid was the political system dismantled in South Africa at the end of the 20th century.",
            true,
            "Apartheid - the system of legal, racial segregation - governed South Africa from 1948-1994"
        ),
        Question(
            "Other than water, coffee is the world's most popular drink.",
            true,
            "Coffee is consumed by about one-third of Earth's population."
        ),
        Question(
          "Candi Sewu in Indonesia only made in 1 night.",
            isTrue = true,
            "There's a legend about Candi Sewu where the all of the candi (sewu means 1000) only made in 1 night because of love."
        ),
        Question(
            "Cinderella was the first Disney princess",
            false,
            "Snow White and the Seven Dwarfs was released first in December 1937"
        ),
        Question(
            "M&M stands for Mars and Moordale",
            false,
            "M&M stands for Mars and Murrie"
        ),
        Question(
            "Approximately one quarter of human bones are in the feet",
            true,
            "True – 52 bones in the feet and 206 in the whole body."
        ),
        Question(
            "The average person will shed 10 pounds of skin during their lifetime.",
            false,
            "False – they will shed approximately 40"
        ),
        Question(
            "The Great Wall Of China is visible from the moon.",
            false,
            "False – at a low orbit the Great Wall is visible, but no man-made structure is visible from outer space or the moon."
        ),
        Question(
            "Louis Braille, creator of the Braille system of writing for the blind, was himself blind.",
            true,
            "Despite being blinded at an early age, Braille was an accomplished musician, inventor, and teacher of the blind."
        ),
        Question(
            "Peanuts are not nuts.",
            true,
            "Peanuts are legumes like lentils and peas."
        ),
        Question(
            "People may sneeze or cough while sleeping deeply.",
            false,
            "We can’t sneeze or cough when in deep sleep. Our body must enter a state of wakefulness to do so."
        ),
        Question(
            "Matches were invented before lighters.",
            false,
            "The first push-button lighter, the Döbereiner Lamp, was invented in 1824. The practical friction matches similar to what we use today were invented in 1827."
        ),
        Question(
            "The heaviest pumpkin ever weighed more than a tonne.",
            true,
            "The heaviest pumpkin weighed 1190.49 kg (2624.6 lb) and was grown by Mathias Willemijns from Belgium."
        ),
        Question(
            "The first oranges weren’t orange",
            true,
            "The original oranges from Southeast Asia were a tangerine-pomelo hybrid, and they were actually green"
        ),
        Question(
            "The Mona Liza was stolen from the Louvre in 1911.",
            true,
            "It was stolen by Vincenzo Peruggia who had worked at the Museum. The masterpiece was recovered two years later."
        ),
        Question(
            "Copyrights depreciate over time.",
            true,
            "Because copyrights have an expiration date, their value decreases as that date approaches."
        ),
        Question(
            "Muddy York is a nickname for New York in the Winter.",
            false,
            "It’s an old nickname given to Toronto, originally called Town of York in honor of The Duke of York. It refers to historical problems in the city’s drainage system."
        ),
        Question(
            "Does Whales make friends for life ?",
            true,
            "They communicate with each other and visit each other. One more proof that animals are not so different from humans."
        ),
        Question(
            "Is the Chinese wall visible from space?",
            false,
            "Contrary to what many people say, from space it is impossible to discern any building. Not even the Great Wall of China."
        ),
        Question(
            "Are penguins in love for life?",
            true,
            "When the penguins find their partner, it is for life. They even propose to each other by giving each other rocks."
        ),
        Question(
            "You only use 10 percent of your brain.",
            false,
            "Modern PET and MRI scans of brain activity show that humans use way more than 10 percent of their gray matter on a regular basis -- though it might seem like some people use way less"
        ),
        Question(
            "One in every 200 men on Earth is descended from Genghis Khan.",
            true,
            "The 13th century Mongolian warrior not only conquered many villages, but also took plenty of lovers. That's 0.5 percent of the male population or 16 million people share Khan's DNA."
        ),
        Question(
            "The Statue of Liberty was a gift from France to America.",
            true,
            "It was a gift to America on the 100th anniversary of the Declaration of Independence."
        ),
        Question(
            "Bhutan is the only country in the world that doesn't have a rectangular flag.",
            false,
            "Nepal is the only country in the world that has a non-rectangular flag. Its flag is a combination of two single pennons."
        ),
        Question(
            "Cats were revered animals in ancient Egypt?",
            true,
            "They were revered for more than 3,000 years. Several ancient Egyptian deities were depicted and sculptured with cat-like heads such as Mafdet, Bastet and Sekhmet, representing justice, fertility and power."
        ),
        Question(
            "Vitamin C is also known by the chemical name of Ascorbic Acid.",
            true,
            "Ascorbic acid is the form of vitamin C found naturally in food. It has good bioavailability but some people find it too acidic on their gut and can’t tolerate higher doses."
        ),
        Question(
            "Popping your finger or toe knuckles is bad for your joints.",
            false,
            "There is no scientific proof, it doesn't cause arthritis or make your knuckles larger, but it can be distracting or loud to people around you."
        ),
        Question(
            "The liver is the largest organ in the human body.",
            false,
            "The human body’s largest organ is the skin."
        ),
        Question(
            "Confucius is a world-renowned Latin philosopher.",
            false,
            "Despite the sound of his name, Confucius was chinese."
        ),
        Question(
            "Athlete Usain Bolt is faster than a cheetah.",
            false,
            "Not quite. Bolt is fast, but the cheetah could outpace Bolt at about three times his top speed."
        ),
        Question(
            "Rio de Janeiro is the capital city of Brazil.",
            false,
            "False. The capital of Brazil is the city of Brasília. Rio de Janeiro is Brazil’s second most populated city."
        ),
        Question(
            "Grapefruit can cause poisoning if consumed with some prescribed drugs.",
            true,
            "Grapefruit has components that block enzymes that serve to break down drugs and eliminate them from the body."
        ),
        Question(
            "Human teeth are just as strong as the teeth of a mature shark.",
            true,
            "The crystals in human teeth have a special arrangement and they are 'glued together' by proteins which stop cracks from running through the whole tooth."
        ),
        Question(
            "The lighter was invented before the matches.",
            true,
            "The first lighter was produced in 1816. Match-like chemical reactions began back in the 17th century with the discovery of phosphorus, but the true friction match was not invented until 1827."
        ),
        Question(
            "Marrakesh is the capital of Morocco",
            false,
            "False - It's Rabat."
        ),
        Question(
            "Einstein failed maths in fourth grade.",
            false,
            "This is a rumor he always excelled in physics and maths, but it was the non-scientific subjects he was poor in."
        ),
        Question(
            "Willow is the name of an animal",
            false,
            "False - It is a flower."
        ),
        Question(
            "Coffee helps you lose weight",
            false,
            "The stimulating effects of caffeine can slightly — very slightly — increase your metabolism, but not enough to make a dent in your diet, especially in terms of long-term weight loss"
        ),
        Question(
            "The entire world's population could fit inside Los Angeles.",
            true,
            "According to National Geographic, if every single person stand shoulder-to-shoulder, they could all fit within the 500 square miles of Los Angeles"
        ),
        Question(
            "Flight recorders, popularly known as black box, are orange in colour.",
            true,
            "Flight recorders (black box) are painted bright orange to aid in their recovery after accidents."
        ),
        Question(
            "Sound waves travel faster than light.",
            false,
            "Light travels faster than sound waves."
        ),
        Question(
            "Venus is the hottest planet in the solar system.",
            true,
            "Venus has an average surface temperature of around 450° C. Mercury is closer to the sun, but has no atmosphere to regulate temperature it has a very large temperature fluctuation."
        ),
        Question(
            "Thomas Edison discovered gravity.",
            false,
            "Isaac Newton discovered Gravity."
        ),
        Question(
            "Al Pacino was the director of the movie The Godfather.",
            false,
            "Francis Ford Coppola was director of the entire triology of The Godfather movie."
        ),
        Question(
            "Walt disney is the biggest Oscar winner.",
            true,
            "Walt Disney (1901–66) won or received a total of twenty-six Academy Awards, and holds the record for most Academy Awards in history."
        ),
        Question(
            "In the movie American Psychopath the character Patrick Bateman had some inspiration in Tom Cruise.",
            true,
            "The episode where Tom Cruise had a fit of laughter in a David Letterman interview became the inspiration for Christian Bale in building the character Patrick Bateman."
        ),
        Question(
            "The Big Apple is a nickname given to Washington D.C in 1971.",
            false,
            "The name refers to New York City. It originated in the 1920s when John Fitz Gerald started a horse racing column called “Around the Big Apple”."
        ),
        Question(
            "C++ was developed by Bjarne Stroustrup",
            true,
            "C++ programming language was developed in 1980 by Bjarne Stroustrup at bell laboratories of AT&T, located in U.S.A. Bjarne Stroustrup is known as the founder of C++ language."
        ),
        Question(
            "Dark Chocolate are bitter than Milk Chocolate due to its high cocoa content only",
            false,
            "Dark chocolate taste bitter as compared to Milk chocolate due to high cocoa content and low sugar levels"
        ),
        Question(
            "Kotlin was declared the preferred language for Android Developers in 2019",
            true,
            "Google announced in 2019 that Kotlin will be the preferred language for Android Developers"
        ),
        Question(
            "Los Angeles is the Full Name of the City",
            false,
            "Full Name of Los Angeles is El Pueblo de Nuestra Senora la Reina de los Angeles de Porciuncula"
        ),
         Question(
            "The majority of the population is Sikh in India",
            false,
            "Nearly 80 percent of India's population are Hindu, 15 percent are Muslim and millions more are Sikh, Jain or Christian."
        ),
        Question(
            "Strawberry has seeds in it's center",
            false,
            "The strawberry is the only fruit that bears seeds on the outside"
        ),
        Question(
            "The Olympics Used to Award Medals for Art",
            true,
            "From 1912 to 1948, the Olympic Games held competitions in the fine arts. Medals were given for literature, architecture, sculpture, painting, and music."
        ),
        Question(
            "Twitter's logo bird is called Larry",
            true,
            "Twitter's official mascot, the bird which features in the company's logo, is named Larry."
        )
    )


    fun getFiveRandomQuestion(): List<Question>{
        questions.shuffle()
        return questions.subList(0,5)
    }


}
