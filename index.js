const Discord = require('discord.js')
const client = new Discord.Client()

const token = "NjM4MDA5OTM5NjEyNDAxNjc2.XbWfHA.Evz6aDPy-kSNULlqzoEBgx0xQV0"
const PREFIX = "!"

client.on('ready', () => {
    console.log("Bot on...")
})

client.on('message', message => {
    if (message.content == 'yo') { message.channel.send("Watup") }
})

client.on('channelCreate', channel => {
    channel.send("Created channel: ", channel)
})

client.login(token)