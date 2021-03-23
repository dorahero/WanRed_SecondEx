### Solution: 
- 1-3  
```shell
#/bin/bash
var=$(ls /data/WIN_SER/ | grep .csv | wc -l)
mv $(ls /data/WIN_SER/ | grep .csv) /data/final/
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