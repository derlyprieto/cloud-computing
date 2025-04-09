FROM node:23

WORKDIR /app

COPY package*.json . 

RUN npm install

COPY . .

EXPOSE 5173

ENV VITE_ENV="dev"

CMD ["npm", "run", "dev"]