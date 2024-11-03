# Demo spring-boot thymeleaf with DaisyUI

## Requisites
* JDK 11 or higher
* nodeJS 20.16.0 
* npm 10.8.1

## Install

`mvn clean install`

### maven execute `npm install` and update CSS

## Run Project

`mvn spring-boot:run`

### Project runs in http://localhost:8080

* Select your favorite themes in `tailwind.config.js` file.
* You can delete others themes in `tailwind.config.js`file and `layout.html` file.
* Build project again with `mvn clean install`.

## Check DaisyUI documentation
### https://daisyui.com/components/

## Working
### Run the next command to watch css for changes
`tailwindcss -i ./src/main/resources/static/css/styles.css -o ./src/main/resources/static/css/output.css --watch`


## al crear otro proyecto
npm init -y

npm install tailwindcss daisyui

npx tailwindcss init


al copiar y usar este template
npm cache clean --force
npm update
