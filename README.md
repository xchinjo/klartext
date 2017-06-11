# klartext
Learn swedish på ett lite lugnare sätt :)

## Up and running ##

    $ docker-compose up

### Start Spring boot backend ###

    $ docker-compose run --rm --service-ports backend

And you should be able to see 3 docker containers `klartext_es`,`mysql` and `klartext_backend` up

    $ docker ps
    
#### Execute command line scripts ####

Command line scripts involve databae migration,seeding and elasticsearch index setup tasks.

DB migration, seed

    $ docker-compose run --rm ruby db:migrate
    $ docker-compose run --rm ruby db:seed

Elasticsearch Index setup

    $ docker-compose run --rm ruby rake klartext:es_setup

Execute scripts in docker container
    
    $ docker-compose run --rm ruby bash
    
Learn more about the command line tasks [here](github.com/chuan-su/klartext/ruby-scripts/README.md)

### Frontend App ###
    
        

    

    
    

