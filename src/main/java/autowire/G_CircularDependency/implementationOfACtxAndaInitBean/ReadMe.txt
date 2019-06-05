Ostatnią aletrnatywą jest zaimplementowanie intrfejsów
ApplicationContextAware: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContextAware.html
InitializingBean: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html
Pierwszy daje nam dostęp do kontextu aplikacji
Drugi pozwala nam nadpisać metodę afterPropertiesSet() która pozwala z kontakstu utworzyc ziarno