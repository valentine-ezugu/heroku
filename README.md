How to deploy the app:

```bash
mvn clean install spring-boot:repackage heroku:deploy
```

- This app includes a simple spring cache system for getting employees
- purpose is to learn how caching works with spring annotation such as @Cacheable