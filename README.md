# Santander Dev week 2026
java RESTful API criada para a Santader dev week.

## Diagrama de Classes
```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +Feature [] features
        +Card card
        +News [] news
    }

    class Account {
        +String number
        +String agency
        +String balance
        +String limit
    }

    class Feature {
        +String icons
        +String description
    }

    class Card {
        +String number
        +String limit
    }

    class News {
        +String icons
        +String description
    }

    User "1" *-- "1" Account
    User "1" *-- "1" Card
    User "1" *-- "N" Feature : has many
    User "1" *-- "N" News : has many
    ```

