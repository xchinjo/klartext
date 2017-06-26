# klartext
> Learn swedish på ett lite lugnare sätt :)

### Database and Elasticsearch setup

DB migration, seed

    $ docker-compose run --rm ruby db:migrate
    $ docker-compose run --rm ruby db:seed

Elasticsearch Index setup

    $ docker-compose run --rm ruby rake es:setup
    
Learn more about the klartext `command line tasks` [here](https://github.com/chuan-su/klartext/tree/master/ruby-scripts/README.md)

### Start Spring boot backend

    $ docker-compose up backend

Learn more about `backend build` for development [here](https://github.com/chuan-su/klartext/tree/master/backend/README.md)

#### REST API
REST API Documentation can be found [here](https://github.com/chuan-su/klartext/blob/master/backend/API.md)

And you should be able to see 3 docker containers `klartext_es`,`mysql` and `klartext_backend` up

    $ docker ps

### Start Frontend Vue App
    
    $ docker-compose up frontend
    
Learn more about `frontend build`  [here](https://github.com/chuan-su/klartext/tree/master/frontend/README.md)
       

    

    
    

