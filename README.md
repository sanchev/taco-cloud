# Taco Cloud

<img src="https://github.com/sanchev/taco-cloud/workflows/Build_and_Test/badge.svg?branch=main"><br>

Application based on the book by Craig Walls "Spring in Action"

# Test

Before test

    docker network create cassandra-net
    docker run --name my-cassandra --network cassandra-net -p 9042:9042 cassandra:latest

Wait for my-cassandra to load and then open new terminal

    docker exec -it my-cassandra cqlsh
    create keyspace tacocloud with replication={'class':'SimpleStrategy', 'replication_factor':1} and durable_writes=true;

You can test after

# Technological stack
- SpringBoot as a skeleton framework

## License
This project is Apache License 2.0 - see the [LICENSE](LICENSE) file for details.