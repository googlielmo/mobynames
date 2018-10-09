# MobyNames

MobyNames is a Java port of the [Moby Project](https://github.com/moby/moby) random name generator (https://github.com/moby/moby/blob/master/pkg/namesgenerator/names-generator.go).

Released under [Apache-2.0 License](LICENSE)

```bash
$ mvn clean install
```

## Usage

In your code:

```java
final String name = MobyNames.getRandomName(0);
```

As a standalone utility:

```bash
$ java -jar mobynames-1.0.jar
trusting_goldberg
```