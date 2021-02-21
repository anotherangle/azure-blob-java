To create java project 

`mvn archetype:generate -DgroupId=com.blobs.quickstart \
                       -DartifactId=blob-quickstart-v12 \
                       -DarchetypeArtifactId=maven-archetype-quickstart \
                       -DarchetypeVersion=1.4 \
                       -DinteractiveMode=false`
                       
Added dependency in pom.xml

`<dependency>
    <groupId>com.azure</groupId>
    <artifactId>azure-storage-blob</artifactId>
    <version>12.6.0</version>
</dependency>`

Use the code in App.java to upload a object from your system onto azure storage account (BLOB).

