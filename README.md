# Bitmap
## Transforms
### reddify -- Makes the given bmp image more red. Run: ./gradlew run --args 'infile outfile reddify'
### checkers -- Places a black square checker effect. Run: ./gradlew run --args 'infile outfile checkers'
### checkersZag -- Places a zig zaggin black checkers. Run: ./gradlew run --args 'infile outfile checkersZag'
Note: file paths must end in ".bmp" and must be saved in the ./src/main/resources. Output files will have special names so the in file and the out file can match without overridding the original they are written to ./src/main/resources. Test images exist in ./src/test/resources
# Example Run
./gradlew run --args 'Coffee.bmp Coffee.bmp checkers'  
This run will require that Coffee.bmp is saved in the main resources directory. A file named checkersCoffee.bmp in the same resourses directiory. 
