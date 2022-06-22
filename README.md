# Tracto DTO

DTO for schedule of Saratov State University.
Mainly are used in [Tracto](https://github.com/ScribaSSU/tracto) and [Scriba](https://github.com/ScribaSSU/scriba-bot) projects,
but you are free to use it in your projects.

## How to add to your project

Tracto DTO uses [Jitpack.io](https://jitpack.io/) to deliver new releases.

### Maven

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<dependencies>
    <dependency>
        <groupId>com.github.ScribaSSU</groupId>
        <artifactId>tracto-dto</artifactId>
        <version>${tracto-dto.version}</version>
    </dependency>
</dependencies>
```

### Gradle

```Groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

```Groovy
dependencies {
        implementation 'com.github.ScribaSSU:tracto-dto:VERSION'
}
```