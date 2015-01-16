# export CURRENT_PATH=$(pwd)
export CURRENT_PATH=$HOME/bin/tools


export JAVA_PATH=$CURRENT_PATH/jdk1.6.0_30/bin
export JRE_PATH=$CURRENT_PATH/jdk1.6.0_30/jre/bin
export CLASSPATH_JAVA=$CURRENT_PATH/jdk1.6.0_30/lib
export JAVA_HOME_JAVA=$CURRENT_PATH/jdk1.6.0_30


if [[ ":${PATH}:" != *":${JAVA_PATH}:"* ]]; then 

	export PATH=${PATH}:${JAVA_PATH}
	export PATH=${PATH}:${JRE_PATH}
	export CLASSPATH=${CLASSPATH_JAVA}
	export JAVA_HOME=${JAVA_HOME_JAVA}
	echo java path add........... 
else
	echo java path already add...........
fi


