### Solution: 
- 1-3  
```shell
#/bin/bash
var=$(ls | grep .py | wc -l)
if [ $var -ne 0 ]; then
       mv *.py tmp
fi
res="Move ${var} files."
echo $res
```

- 1-4  
```
i 002.txt
ii 002.txt
iii 001.csv
iv 002.txt
```

- 1-5  
```

```

- 1-6  
```

```