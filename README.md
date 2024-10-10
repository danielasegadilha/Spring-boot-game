
# charade-API-RESTful

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

## 🚀 Project Overview

The **charade-API-RESTful** is a Spring Boot-based API designed to provide a robust system for managing charades. These charades can be used in various other projects or applications, offering a rich and diverse set of riddles for users to interact with. The charades are classified by **difficulty levels** (EASY, MEDIUM, HARD) and **tags**, and can be either **multiple-choice** or **short-answer** formats. This project aims to be highly flexible and modular for integration with various applications.

## 🛠️ Features

- **Charade Types**: Multiple-choice and Short-answer charades.
- **Difficulty Levels**: Charades are categorized as **EASY**, **MEDIUM**, or **HARD** using enums.
- **Tags**: Charades can be tagged with various descriptors to enable filtering and categorization.
- **Reusable API**: Can be consumed by other projects or services.

## 🧠 Class Diagram

```mermaid
classDiagram
    Charade <|-- MultipleChoice
    Charade <|-- ShortAnswer
    MultipleChoice o-- Option
    Charade --o Tag
    class Charade {
        +Long id
        +String question
        +Difficulty difficulty
        +String origin
        +List~Tag~ tags
        +setDifficulty(Difficulty difficulty)
        +getDifficulty()
        +setQuestion(String question)
        +getQuestion()
        +setOrigin(String origin)
        +getOrigin()
    }
    class MultipleChoice {
        +List~Option~ options
        +setOptions(List~Option~ options)
        +getOptions()
    }
    class Option {
        +Long id
        +MultipleChoice charade
        +String optionText
        +boolean isCorrect
        +setOptionText(String optionText)
        +getOptionText()
        +setCorrect(boolean isCorrect)
        +isCorrect()
    }
    class ShortAnswer {
        +String answer
        +setAnswer(String answer)
        +getAnswer()
    }
    class Tag {
        +Long id
        +String name
        +setName(String name)
        +getName()
    }
