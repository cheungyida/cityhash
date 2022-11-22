# cityhash
**real** java version implementation of [cityhash](https://github.com/google/cityhash)

## usage
`mvn clean install`

## something you need to know

this is motivated by [CityHash-For-Java](https://github.com/tamtam180/CityHash-For-Java)
but seems the author did NOT strictly follow the google cityhash algorithm. And it will generate different output result for some input with `python` and `c++` version. (ignore this if you don't care about cross-language)

### python version
```
>>> from cityhash import CityHash64WithSeed
>>> input = "1234567890"
>>> hash = CityHash64WithSeed(input)
>>> print("%s\t%x\t%d" % (input, hash, hash))
1234567890      4fabad57d84b98c1        5740872742816422081
```
### java version
```
public static void main(String[] args) {
    CityHash hasher = new CityHash();

    String s1 = "1234567890";
    long hash1 = hasher.hash64WithSeed(s1, 0);
    System.out.printf("%s\t%s\t%d\n", s1, Long.toHexString(hash1), hash1);
}

1234567890      4fabad57d84b98c1        5740872742816422081
```