package com.blobs.quickstart;


import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

public class App
{
    public static void main( String[] args )
    {
        //name of file which I want to keep in my storage account
        String file = "file_name";
        //storage account name
        String st_account = "your_Storage_accoutn name";
        //container name
        String ct_name = "your_container_name";

        //connection string for my code to get connected to azure storage account
        String connectStr = "your_connection _string";

        //creating blob service client
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();

        //creating a client for container
        BlobContainerClient blobContainerClient = blobServiceClient.getBlobContainerClient(ct_name);

        //create a client to upload a blob
        BlobClient blobClient = blobContainerClient.getBlobClient(file);

        //uploading a blob
        blobClient.uploadFromFile("path_of_file_which_you_wish_to_upload");

        //printing url of blob
        System.out.println("https://"+st_account+".blob.core.windows.net/"+ct_name+"/"+file);
    }
}

