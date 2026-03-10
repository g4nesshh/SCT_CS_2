"# SCS_CS_2" 
# Image Encryption Tool (Pixel Manipulation)

## Overview

This project implements a simple **image encryption and decryption tool using pixel manipulation in Java**.
The program reads an image, modifies the RGB pixel values using a mathematical operation (XOR with a key), and produces an encrypted image. Running the process again with the same key restores the original image.

This demonstrates the concept of **basic image encryption using cryptographic operations on pixel values**.

---

## Features

* Encrypts an image using pixel manipulation
* Decrypts the image using the same key
* Supports common image formats such as **JPG and PNG**
* Simple implementation using **Java BufferedImage**

---

## Technologies Used

* Java
* BufferedImage API
* ImageIO Library

---

## How the Encryption Works

Each pixel in an image contains **Red, Green, and Blue (RGB)** values.

Example:
R = 120
G = 45
B = 200

The encryption algorithm applies an **XOR operation with a key** to each RGB value.

Example:
Encrypted Value = Original Value XOR Key

Since XOR is reversible, applying the same operation again decrypts the image.

---

## Project Structure

ImageEncryptionProject
│
├── src
│   └── ImageEncryption.java
│
├── input.jpg
├── encrypted.jpg
├── decrypted.jpg

---

## How to Run

1. Clone the repository

git clone https://github.com/your-username/image-encryption.git

2. Open the project in any Java IDE (Eclipse / IntelliJ)

3. Place an image in the project folder named

input.jpg

4. Run the program

5. The program will generate:

encrypted.jpg
decrypted.jpg

---

## Example Workflow

Original Image → Encryption → Encrypted Image → Decryption → Restored Image

---

## Learning Outcome

This project demonstrates:

* Basic **image processing**
* **pixel manipulation techniques**
* simple **cryptographic operations**
* file handling in Java

---

## Future Improvements

* GUI interface for selecting images
* Advanced encryption algorithms
* Random key generation
* Pixel shuffling encryption

---

## Author

Ganesh Mane
