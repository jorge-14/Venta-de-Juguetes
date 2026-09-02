import {TouchableOpacity, StyleSheet, View, Text, TextInput, KeyboardAvoidingView, Platform, Image} from 'react-native';
import { useState } from 'react';
import { LinearGradient } from 'expo-linear-gradient';
import { Ionicons } from '@expo/vector-icons';

export default function LoginScreen() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [showPassword, setShowPassword] = useState(false);
    const [loading, setLoading] = useState(false);

    const handleSubmit = () => {
        setLoading(true);
        console.log('Username:', username);
        setTimeout(() => setLoading(false), 1000);
    };

    return (
        <LinearGradient colors={['#0f172a', '#020617', '#000000']} style={styles.background}>
            <KeyboardAvoidingView style={styles.flex} behavior={Platform.OS === 'ios' ? 'padding' : undefined}>
                <View style={styles.header}>
                    <LinearGradient colors={['#0ea5e9', '#115e59']} style={styles.headerGradient}>
                        <View style={[styles.circle, styles.circleTopLeft]} />
                        <View style={[styles.circle, styles.circleBottomRight]} />
                        <Image source={require('../../assets/images/260_f2.png')} style={styles.logo} resizeMode="contain"/>
                        <Text style={styles.brand}>Venta de Juguetes</Text>
                        <Text style={styles.brandSubtitle}>
                            Gestioná tu tienda de forma simple
                        </Text>
                    </LinearGradient>
                </View>
                <View style={styles.cardWrapper}>
                    <View style={styles.card}>
                        <View style={styles.cardHeader}>
                            <Text style={styles.cardTitle}>Iniciar sesión</Text>
                            <Text style={styles.cardSubtitle}>
                                Ingresá tus datos para continuar
                            </Text>
                        </View>
                        <View style={styles.field}>
                            <Text style={styles.label}>Usuario</Text>
                            <View style={styles.inputWrapper}>
                                <Ionicons name="person-outline" size={18} color="#94a3b8" style={styles.icon}/>
                                <TextInput style={styles.input} placeholder="tu usuario" placeholderTextColor="#64748b"
                                           autoCapitalize="none" value={username} onChangeText={setUsername}/>
                            </View>
                        </View>
                        <View style={styles.field}>
                            <Text style={styles.label}>Contraseña</Text>
                            <View style={styles.inputWrapper}>
                                <Ionicons name="lock-closed-outline" size={18} color="#94a3b8" style={styles.icon}/>
                                <TextInput style={[styles.input, { flex: 1 }]} placeholder="tu contraseña"
                                           placeholderTextColor="#64748b" secureTextEntry={!showPassword}
                                           value={password} onChangeText={setPassword}/>
                                <TouchableOpacity onPress={() => setShowPassword(!showPassword)}>
                                    <Ionicons name={showPassword ? 'eye-off-outline' : 'eye-outline'} size={18} color="#94a3b8"/>
                                </TouchableOpacity>
                            </View>
                        </View>
                        <TouchableOpacity style={styles.button} onPress={handleSubmit} disabled={loading}>
                            <Ionicons name="log-in-outline" size={18} color="#fff" style={{ marginRight: 8 }}/>
                            <Text style={styles.buttonText}>
                                {loading ? 'Ingresando...' : 'Ingresar'}
                            </Text>
                        </TouchableOpacity>
                    </View>
                </View>
            </KeyboardAvoidingView>
        </LinearGradient>
    );
}

const styles = StyleSheet.create({
    flex: { flex: 1 },
    background: { flex: 1 },
    header: { height: '38%' },
    headerGradient: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
        overflow: 'hidden',
    },
    circle: {
        position: 'absolute',
        borderRadius: 999,
        backgroundColor: 'rgba(255,255,255,0.1)',
    },
    circleTopLeft: { width: 160, height: 160, top: -60, left: -60 },
    circleBottomRight: { width: 120, height: 120, bottom: -30, right: -30 },
    logo: { width: 90, height: 90, marginBottom: 12, zIndex: 10 },
    brand: { color: '#fff', fontSize: 26, fontWeight: 'bold', zIndex: 10 },
    brandSubtitle: { color: '#d1fae5', fontSize: 14, marginTop: 4, zIndex: 10 },
    cardWrapper: { flex: 1, paddingHorizontal: 24, marginTop: -32 },
    card: {
        backgroundColor: 'rgba(255,255,255,0.06)',
        borderColor: 'rgba(255,255,255,0.1)',
        borderWidth: 1,
        borderRadius: 20,
        padding: 24,
        shadowColor: '#000',
        shadowOpacity: 0.4,
        shadowRadius: 20,
        shadowOffset: { width: 0, height: 10 },
    },
    cardHeader: { alignItems: 'center', marginBottom: 24 },
    cardTitle: { color: '#fff', fontSize: 20, fontWeight: '600' },
    cardSubtitle: { color: '#9ca3af', fontSize: 13, marginTop: 4 },
    field: { marginBottom: 18 },
    label: { color: '#d1d5db', fontSize: 13, fontWeight: '500', marginBottom: 6 },
    inputWrapper: {
        flexDirection: 'row',
        alignItems: 'center',
        borderWidth: 1,
        borderColor: 'rgba(255,255,255,0.15)',
        borderRadius: 10,
        paddingHorizontal: 12,
        backgroundColor: 'rgba(255,255,255,0.03)',
    },
    icon: { marginRight: 8 },
    input: { flex: 1, color: '#fff', paddingVertical: 12, fontSize: 15 },
    button: {
        flexDirection: 'row',
        backgroundColor: '#0d9488',
        borderRadius: 10,
        paddingVertical: 14,
        alignItems: 'center',
        justifyContent: 'center',
        marginTop: 8,
    },
    buttonText: { color: '#fff', fontWeight: '600', fontSize: 15 },
});


