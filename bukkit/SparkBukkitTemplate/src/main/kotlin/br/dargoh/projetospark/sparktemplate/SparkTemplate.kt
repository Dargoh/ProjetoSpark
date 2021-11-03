package br.dargoh.projetospark.sparktemplate

import br.com.devsrsouza.kotlinbukkitapi.architecture.KotlinPlugin

class SparkTemplate : KotlinPlugin() {

    override fun onPluginEnable(){
        logger.info("Ligando.")
    }

    override fun onPluginDisable(){
        logger.info("Desligando.")
    }

}